package solid_dip_v1;

public class TestaDev {
    public static void main(String[] args) {
        BackendDev backendDev = new BackendDev();
        FrontendDev frontend = new FrontendDev();

        frontend.dev();
        backendDev.dev();

    }
}
