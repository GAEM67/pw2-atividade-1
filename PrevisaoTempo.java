package br.com.etechoracio.model;

import br.com.etechoracio.EnumPrevisao.DiaSemana;
import br.com.etechoracio.EnumPrevisao.FaseLua;

public class PrevisaoTempo {
    public int dias_previsao;
    public String cidade;
    public String estado;
    public DiaSemana diaSemana;
    public double temperatura;
    public double chance_de_chuva;
    public String info_previsao;
    public double velocidade_do_vento;
    public double umidade_do_ar;
    public FaseLua faseLua;
}
