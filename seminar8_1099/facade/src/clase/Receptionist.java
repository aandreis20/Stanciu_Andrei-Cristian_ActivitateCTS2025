package clase;

public class Receptionist {
    public String poateLuaLocLaMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        if (masa.isEsteLibera()){
            if (picolo.debaraseazaMasa(masa)){
                if(ospatar.esteAranjataMasa(masa)){
                    return("Luati loc la masa " + masa.getNumarMasa());
                }
                else{
                    return("Asteptati sa eliberam masa");
                }
            }
            else{
                return("Asteptati pentru ca tocmai s-a ridicat cineva");
            }
        }
        else{
            return("Momentan masa " + masa.getNumarMasa()+ " este ocupata");
        }

    }
}
