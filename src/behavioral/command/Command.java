package behavioral.command;

/*
The goal of the Command behavioral pattern is to separate objects that
send requests from objects that accept their results. It is done by introducing the
command object for this process. Optionally, the command may also undo the result of such a process.
By wrapping the process execution into a separate object, we keep the SOLID principles, removing the potential
strong coupling between the sender and the recipient of the request result.
 */
public interface Command {
    void apply();
    void cancel();
}
