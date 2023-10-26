package JavaSeccion16ejercicio3;

import java.util.Map;

public class ObjetoHttpRespuesta extends ObjetoHttp{

	int httpResponse;
	
	public ObjetoHttpRespuesta(String body, Map<String, String> headers, int httpResponse) {
		super(body, headers);
		this.httpResponse=httpResponse;
	}
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjetoHttp {");
        sb.append("body='").append(body).append('\'');
        sb.append(", headers=").append(headers);
        sb.append('}');
        sb.append('\n').append(httpResponse);
        return sb.toString();
    }
	
}
