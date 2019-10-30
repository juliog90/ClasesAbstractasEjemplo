package app;

public class App {
   public static void main(String[] args) throws Exception {
      // Asignamos una constante a una varable de tipo del enum
      EstadoUsuario estado = EstadoUsuario.PENDIENTE;

      // Uso en if
      System.out.println("Uso en if");
      if (estado == EstadoUsuario.PENDIENTE) {
         System.out.println("Este usuario tiene el estado pendiente");
         // Podemos imprimir directamente
         System.out.println("Estado del Usuario " + EstadoUsuario.PENDIENTE);
      }

      System.out.println("Uso en switch");
      // Uso en switch
      switch (estado) {
      case PENDIENTE:
         System.out.println("Este usuario tiene el estado pendiente");
         break;
      case ACTIVO:
         System.out.println("Este usuario tiene el estado activo");
         break;
      case INACTIVO:
         System.out.println("Este usuario tiene el estado pendiente");
         break;
      case BORRADO:
         System.out.println("Este usuario tiene el estado borrado");
         break;
      // case LOGEADO:
      //    System.out.println("Este usuario tiene le estado de logeado");
      //    break;
      }

      // Iteracion del enum
      System.out.println("Iteracion del enum");
      for(EstadoUsuario usuario : EstadoUsuario.values())
      {
         System.out.println(usuario);
      }

      // Obtner instancia de Enum por cadena
      System.out.println("Obtencion del enum por cadena");
      EstadoUsuario unEstado = EstadoUsuario.valueOf("PENDIENTE");
      System.out.println(unEstado);


      /*********************
       * Enum con campos
       */

      System.out.println("Enums con miembros/campos y metodos");
      Nivel bajo = Nivel.BAJO;
      // Forma estatica
      System.out.println(Nivel.BAJO.getNivelCodigo());
      // A traves de una instancia de enum (Nivel)
      System.out.println(bajo.getNivelCodigo());

       /*********************
       * Enum con metodos abstractos
       */
      System.out.println("Enums con metodos abstractos");
      Pais usa = Pais.US;
      System.out.println("En USA se paga en " + usa.getCambio());

        /*********************
       * Enum implementando una interfaz
       */
      System.out.println("Enum implementado una interfaz");
      Elemento uno = Elemento.UNO;
      System.out.println("La cantidad de caracteres que hay en \"uno\" es " + uno.getStringSize());

   }
}