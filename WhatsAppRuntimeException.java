/**
 * Created by wayne on 1/27/16.
 */

/**
 * A simple exception class for validation errors like null or empty values
 *
 * @author jmishra
 */
public class WhatsAppRuntimeException extends Exception
{

    /**
     * Construct an instance of this exception with a custom message
     *
     * @param message the custom message to be wrapped around by this exception
     */
    public WhatsAppRuntimeException(String message)
    {
        super(message);
    }

    /**
     * Construct an instance of this exception without any message
     */
    public WhatsAppRuntimeException()
    {
        super();
    }
}
