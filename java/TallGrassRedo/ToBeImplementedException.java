public class ToBeImplementedException extends Error
{

    private static final long serialVersionUID = 1997753363232807009L;

		public ToBeImplementedException()
		{
		}

		public ToBeImplementedException(String message)
		{
			super(message);
		}

		public ToBeImplementedException(Throwable cause)
		{
			super(cause);
		}

		public ToBeImplementedException(String message, Throwable cause)
		{
			super(message, cause);
		}

		public ToBeImplementedException(String message, Throwable cause, 
                                           boolean enableSuppression, boolean writableStackTrace)
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}

}