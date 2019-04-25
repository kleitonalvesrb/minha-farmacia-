package kleitonbatista.com.br.minhafarmcia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private int i = 0;
    private EditText login;
    private EditText senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setLogin((EditText) findViewById(R.id.etLogin));
        setSenha((EditText) findViewById(R.id.etSenha));
    }
    public void logar(View v){
        String login = getLogin().getText().toString().trim();
        String senha = getSenha().getText().toString().trim();

        if (validaCampo(getLogin(),Constantes.VALIDACAO_CAMPO,1) &&
                validaCampo(getSenha(),Constantes.VALIDACAO_CAMPO,1)){
            Toast.makeText(this,"Validado",Toast.LENGTH_LONG).show();
        }
/*teste*/
    }


    public EditText getLogin() {
        return login;
    }

    public void setLogin(EditText login) {
        this.login = login;
    }

    public EditText getSenha() {
        return senha;
    }

    public void setSenha(EditText senha) {
        this.senha = senha;
    }

    /**
     *
     * @param campo
     * @param msg
     * @param tamMin
     * @return
     */
    public boolean validaCampo(EditText campo, String msg, int tamMin){
        boolean retorno = true;
        if (campo.getText().toString().trim().length() < tamMin){
            campo.setError(msg);
            campo.requestFocus();
            retorno = false;
        }
        return retorno;
    }
}
