
public class TestCommand {
    public TestCommand() {
        Invoker invoker = new Invoker();
        // Create receivers
        AsiaServer asiaServer = new AsiaServer();
        EuroServer euroServer = new EuroServer();
        USServer usServer = new USServer();
        // Create the commands
        ShutDownCommand shutDownAsia = new ShutDownCommand(asiaServer);
        RunDiagnosticsCommand runDiagnosticAsia =
                new RunDiagnosticsCommand(asiaServer);
        RebootCommand rebootAsia = new RebootCommand(asiaServer);
        ShutDownCommand shutDownEuro = new ShutDownCommand(euroServer);
        RunDiagnosticsCommand runDiagnosticEuro =
                new RunDiagnosticsCommand(euroServer);
        RebootCommand rebootEuro = new RebootCommand(euroServer);
        ShutDownCommand shutDownUs = new ShutDownCommand(usServer);
        RunDiagnosticsCommand runDiagnosticUs =
                new RunDiagnosticsCommand(usServer);
        RebootCommand rebootUs = new RebootCommand(usServer);
        // Asia Server
        invoker.setCommand(shutDownAsia);
        invoker.run();
        invoker.setCommand(runDiagnosticAsia);
        invoker.run();
        invoker.setCommand(rebootAsia);
        invoker.run();
        // Euro Server
        invoker.setCommand(shutDownEuro);
        invoker.run();
        invoker.setCommand(runDiagnosticEuro);
        invoker.run();
        invoker.setCommand(rebootEuro);
        invoker.run();
        // US Server
        invoker.setCommand(shutDownUs);
        invoker.run();
        invoker.setCommand(runDiagnosticUs);
        invoker.run();
        invoker.setCommand(rebootUs);
        invoker.run();
    }
    public static void main(String[] args) {
        new TestCommand();
    }
}
