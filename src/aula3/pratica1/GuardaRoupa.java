package aula3.pratica1;

import com.sun.source.tree.ReturnTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private static HashMap<Integer,List<Vestuario>> dicionario = new HashMap<>();
    private static int contador = 0;

    public Integer guardaVestuarios(List<Vestuario> listaVest){

        dicionario.put(contador, listaVest);
        System.out.println("Salvo na posição "+dicionario.size());
        contador ++;

        return contador;
    }

    public void mostrarVestuarios( ){
        for (Map.Entry<Integer,List<Vestuario>> pair : dicionario.entrySet()) {
            System.out.println("ID - "+pair.getKey());
            for (Vestuario vst: pair.getValue()){
                System.out.println("Marca - "+vst.getMarca());
                System.out.println("Peça - "+vst.getModelo());
            }

        }
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        List<Vestuario> lst = dicionario.get(id);

        return lst;
    }




}
