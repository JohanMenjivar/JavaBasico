package JavaSeccion16ejercicio3;

import java.io.Serializable;
import java.util.Map;

public class ObjetoHttp implements Serializable {
    protected String body;
    protected Map<String,String> headers;

    public ObjetoHttp(String body, Map<String, String> headers) {
        this.body = body;
        this.headers = headers;
    }

    
    
    public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}



	public Map<String, String> getHeaders() {
		return headers;
	}



	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}



	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjetoHttp {");
        sb.append("body='").append(body).append('\'');
        sb.append(", headers=").append(headers);
        sb.append('}');
        return sb.toString();
    }
}