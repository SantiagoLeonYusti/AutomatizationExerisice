# language: es

Característica: Registro de usuario y gestión de cuenta

      Escenario: Registro exitoso de usuario y eliminación de cuenta
      Dado que el usuario está en la página de inicio
      Cuando el usuario navega a la página de registro
      Y el usuario completa el proceso de registro
      Entonces la cuenta del usuario es creada
      Cuando el usuario inicia sesión en la cuenta
      Y el usuario elimina la cuenta
      Entonces la cuenta es eliminada exitosamente