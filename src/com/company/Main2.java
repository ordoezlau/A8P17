package com.company;

import com.company.manager.ManagerCorredors;
import com.company.manager.ManagerCorredors2;
import com.company.manager.ManagerEquips;
import com.company.model.Corredor;
import com.company.model.Equip;
import com.company.view.PantallaMenuPrincipal;

public class Main2 {

    public static void main(String[] args) {

//        Equip equip = new Equip("Equipo L");
//        ManagerCorredors2.inscriureCorredor("Laura",equip);
//        ManagerCorredors2.inscriureCorredor("Leo",equip);

        boolean corredor = ManagerCorredors2.existeixCorredor("Leo");
        System.out.println(corredor);
        //System.out.println(corredor.id + " " + corredor.nom + " " + corredor.idEquip);

    }
}
