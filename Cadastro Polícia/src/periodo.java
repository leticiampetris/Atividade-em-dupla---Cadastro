 if(manha > maiorPeriodo){
                maiorPeriodo = manha; 
                periodoA = "Manh�";
	    }else if (manha == maiorPeriodo){
		periodoA = periodoA + ", Manh�";
            }else if(tarde > maiorPeriodo){
                maiorPeriodo = tarde;
                periodoA = "Tarde";
	    }else if (tarde == maiorPeriodo){
		periodoA = periodoA + ", "Tarde";
            }else if(noite > maiorPeriodo){
                maiorPeriodo = noite;
                periodoA = "Noite";
	    }else if (noite == maiorPeriodo){
		periodoA = periodoA + ", Noite";
            }else if(madrugada > maiorPeriodo){
                maiorPeriodo = madrugada;
                periodoA = "Madrugada";
	    }else if (madrugada == maiorPeriodo){
		periodoA = periodoA + ", Madrugada";
            }