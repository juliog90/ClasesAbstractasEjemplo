package app;

public enum Pais
{
    US {
        public String getCambio() 
        {
            return "DOLAR";
        }
    },
    RUSSIA {
        public String getCambio() 
        {
            return "RUBLO";
        }
    },
    INDIA {
        public String getCambio() 
        {
            return "RUPIA";
        }
    };

    public abstract String getCambio();
}