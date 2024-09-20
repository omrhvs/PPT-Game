import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        preguntarJugada();
    }

    public static void preguntarJugada()
    {
        byte movimiento;

        do
        {
            movimiento = Byte.parseByte(JOptionPane.showInputDialog(
                    "Ingrese una opcion" +
                            "\n1- Piedra" +
                            "\n2- Papel" +
                            "\n3- Tijeras" +
                            "\n4- Retirarse"));

            int movimientoIA;
            movimientoIA = generarMovimientoIA();

            switch (movimiento)
            {
                case 1, 2, 3 ->
                {
                    anunciarJugadas(movimiento, movimientoIA);
                    comprobarJugada(movimientoIA);
                }
                default ->
                {
                    JOptionPane.showMessageDialog(null, "Movimiento invalido, intente de nuevo.");
                    preguntarJugada();
                }
            }
        }
        while (movimiento !=4);
    }

    public static void anunciarJugadas(int movimientoPropio, int movimientoContrario)
    {
        String jugada;
        switch (movimientoPropio)
        {
            case 1:
            {
                jugada = "Piedra";
                JOptionPane.showMessageDialog(null, "Tu jugada: " + jugada);
                break;
            }
            case 2:
            {
                jugada = "Papel";
                JOptionPane.showMessageDialog(null, "Tu jugada: " + jugada);
                break;
            }
            case 3:
            {
                jugada = "Tijera";
                JOptionPane.showMessageDialog(null, "Tu jugada: " + jugada);
                break;
            }
        }
        switch (movimientoContrario)
        {
            case 1:
            {
                jugada = "Piedra";
                JOptionPane.showMessageDialog(null, "Tu jugada: " + jugada);
                break;
            }
            case 2:
            {
                jugada = "Papel";
                JOptionPane.showMessageDialog(null, "Tu jugada: " + jugada);
                break;
            }
            case 3:
            {
                jugada = "Tijera";
                JOptionPane.showMessageDialog(null, "Tu jugada: " + jugada);
                break;
            }
        }
    }

    public static void comprobarJugada(int mIA)
    {
        switch (mIA)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "Empate");
            }
            case 2:
            {
                JOptionPane.showMessageDialog(null, "Perdiste");
            }
            case 3:
            {
                JOptionPane.showMessageDialog(null, "Ganaste");
            }
        }
    }

    public static int generarMovimientoIA()
    {
        int numMax = 3, numMin = 1;
        int respuesta =  (int) (Math.random() * (numMax - numMin + 1)) + numMin;
        return respuesta;
    }
}
