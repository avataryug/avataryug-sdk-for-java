package Avataryug.Client;

/**
 * Represents a set of configuration settings.
 */
public  class ConfigurationApi
{
    /**
     * Gets or sets the access token (Bearer/OAuth authentication).
     */
    private static String accessToken ;

    /**
     * Gets or sets the User Id.
     */
    private static String userId ;

    /**
     * Set Access Token.
     * @param access_Token
     */
    public static void setAccessToken(String access_Token) {
        accessToken = access_Token;
    }

    /**
     * Get Access Token.
     * @return
     */
    public static String getAccessToken() {
        return accessToken;
    }

    /**
     * Set User ID
     * @param used_ID
     */
    public static void setuserID(String used_ID) {
        userId = used_ID;
    }

    /**
     * Get User ID
     * @return
     */
    public static String getuserID() {
        return userId;
    }
}
