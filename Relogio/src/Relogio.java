
public class Relogio {
		private Contador hora;
		private Contador minuto;
		private boolean formato;
		//Creating a timer with hours and minute
		public Relogio() {
			this.hora = new Contador(24);
			this.minuto = new Contador(60);		
			this.formato=true;
		}
		//reset when my timer finish with 60 min
		public void TicTac() {
			minuto.contar();
			if(minuto.getValor()==0) {
				hora.contar();
			}
		}

		public Contador getHora() {
			return hora;
		}

		public void setHora(Contador hora) {
			this.hora = hora;
		}

		public Contador getMinuto() {
			return minuto;
		}

		public void setMinuto(Contador minuto) {
			this.minuto = minuto;
		}

		public boolean isFormato() {
			return formato;
		}

		public void setFormato(boolean formato) {
			this.formato = formato;
		}
		//show methodd
		public String exibe() {
			String retorno = "";
			if (formato) {//12horas
				retorno = hora.getValor()%12+":"+minuto.getValor();
				if(hora.getValor()>=12) {
					retorno=retorno+" p.m";
					
				}
				else
					retorno = retorno + " a.m";
					
			} 
				return retorno;
			
			
			
		}
		
		
	}


