package controlStatements;

public class SignalSwitchCase {

	public static void main(String[] args) {
		String signal="yellow";
		switch(signal)
		{
		case "red":System.out.println("Stop");
		break;
		case "green":System.out.println("Go");
		break;
		case "yellow":System.out.println("Wait");
		break;
		default:System.out.println("Enter valid input");
		break;

	}

}
}
