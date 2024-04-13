package modulos;

public record datos_moneda(
                            //String documentation,
                            //String terms_of_use,
                            //int time_last_update_unix,
                            //String time_last_update_utc,
                            //int time_next_update_unix,
                            //String time_next_update_utc,
                            String base_code,
                            String target_code,
                            String conversion_rate,
                            String conversion_result
                            ) {
                                
                                
                                @Override
                                public String toString() {
                                    return 
                                    "\n-----------------------------------\n"
                                    +"Moneda del usuario: " + base_code+ 
                                    "\n-----------------------------------\n"+ 
                                    "Moneda solicitada de cambio: " +target_code  
                                    + "\n-----------------------------------\n"+
                                    "Valor de cambio: " + conversion_rate 
                                    +"\n-----------------------------------\n"+
                                    "Representacion del cambio de moneda: "+ conversion_result+
                                    "\n-----------------------------------\n";
                                }
                            }
                            

 
