public class Input {
    public static InputType parseInput(String line) {
        if (line.startsWith("read")) {
            return InputType.READ;
        } else if (line.startsWith("write")) {
            return InputType.WRITE;
        }  else if (line.startsWith("readfile")) {
            return InputType.READFILE;
        }  else if (line.startsWith("writefile")) {
            return InputType.WRITEFILE;
        }  else {
            System.out.println("The program cannot recognize this program");
            return InputType.NULL;
        }
    }
}
