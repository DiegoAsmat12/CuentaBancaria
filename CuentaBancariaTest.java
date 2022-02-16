public class CuentaBancariaTest {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.depositarCuentaAhorros(4000);
        cuentaBancaria.depositarCuentaCorriente(2000);
        cuentaBancaria.retirarCuentaAhorros(3000);
        cuentaBancaria.retirarCuentaAhorros(1500);
        System.out.println( cuentaBancaria.toString() );

        CuentaBancaria cuentaBancaria2 = new CuentaBancaria();
        cuentaBancaria2.depositarCuentaAhorros(1500);
        cuentaBancaria2.depositarCuentaCorriente(2000);
        System.out.println(cuentaBancaria2.toString());

        System.out.println("Cantidad de cuentas: "+CuentaBancaria.cantidadCuentas);
        System.out.println("Total de dinero: "+CuentaBancaria.cantidadTotalDinero);
    }
}
