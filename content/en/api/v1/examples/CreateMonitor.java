import com.datadog.api.v2.client.api.MonitorsApi;

public class MonitorsApiExample {

    public static void main(String[] args) {
        MonitorsApi apiInstance = new MonitorsApi();
        Monitor body = ; // Monitor | 
        try {
            Monitor result = apiInstance.createMonitor(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitorsApi#createMonitor");
            e.printStackTrace();
        }
    }
}