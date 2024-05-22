import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class tVM {
    public static void main(String[] args) throws Exception {
        ArrayList<String> operations;
        ArrayList<String> cp = new ArrayList<>();
        Stack<Object> stack = new Stack<>();
        Object[] global = new Object[0];
        Object toadd;
        String mode;
        OpCode code;
        String inputFile = tVMOperations.getInputFile(args);
        String fName;
        fName = inputFile.split("\\.")[0];
        DataInputStream din = tVMOperations.getDin(inputFile);
        mode = tVMOperations.getMode(args);
        PrintWriter writer = tVMOperations.createFile(mode, fName);
        code = tVMOperations.readCommand(din);
        if(code.equals(OpCode.constantPool))
            cp = tVMOperations.loadPool(din);
        else
            din = new DataInputStream(new FileInputStream(inputFile));
        operations = tVMOperations.loadOperations(din);
        for(int i = 0; (i < operations.size() && !code.equals(OpCode.halt)) ; i++){
            code = OpCode.valueOf(operations.get(i).split(" ")[0]);
            i = tVMOperations.readLine(operations.get(i), stack, global, cp, writer, mode, i);
            toadd = tVMOperations.objectToAddStack(code, writer);
            global = tVMOperations.insertObjectToStack(stack, global, code, toadd);
        }
        writer.close();
    }
}
