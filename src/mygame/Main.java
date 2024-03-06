package mygame;

import com.jme3.app.SimpleApplication;

import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    public Spatial spatial_var = null;   
    public Spatial viaLactea_var = null;

    public static void main(String[] args) {
        AppSettings settings = new AppSettings(true);
        settings.setTitle("Sistema Solar");
        settings.setSettingsDialogImage("Interface/SOLAR.png");
        settings.setFullscreen(true);
        Main app = new Main();
        app.setSettings(settings);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Sphere sol = new Sphere(32, 32, 1);
        Sphere mercurio = new Sphere(32, 32, 1);
        Sphere venus = new Sphere(32, 32, 1);
        Sphere tierra = new Sphere(32, 32, 1);
        Sphere marte = new Sphere(32, 32, 1);
        Sphere jupiter = new Sphere(32, 32, 1);
        Sphere saturno = new Sphere(32, 32, 1);
        Sphere urano = new Sphere(32, 32, 1);
        Sphere neptuno = new Sphere(32, 32, 1);

        /*Box sol = new Box(1, 1, 1);
        Box mercurio = new Box(1, 1, 1);
        Box venus = new Box(1, 1, 1);
        Box tierra = new Box(1, 1, 1);
        Box marte = new Box(1, 1, 1);
        Box jupiter = new Box(1, 1, 1);
        Box saturno = new Box(1, 1, 1);
        Box urano = new Box(1, 1, 1);
        Box neptuno = new Box(1, 1, 1);*/
        Geometry geom = new Geometry("sol", sol);
        Geometry geom1= new Geometry("mercurio",mercurio);
        Geometry geom2= new Geometry("venus",venus);
        Geometry geom3= new Geometry("tierra",tierra);
        Geometry geom4= new Geometry("marte",marte);
        Geometry geom5= new Geometry("jupiter",jupiter);
        Geometry geom6= new Geometry("saturno",saturno);
        Geometry geom7= new Geometry("urano",urano);
        Geometry geom8= new Geometry("neptuno",neptuno);
       

     
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.fromRGBA255(255, 105, 0, 1));
        geom.setMaterial(mat);

        Material mat1 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat1.setColor("Color", ColorRGBA.fromRGBA255(255, 9, 101, 1));
        geom1.setMaterial(mat1);
        
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.fromRGBA255(222, 101, 47, 1));
        geom2.setMaterial(mat2);
        
        Material mat3 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat3.setColor("Color", ColorRGBA.fromRGBA255(0, 36, 255, 1));
        geom3.setMaterial(mat3);
        
        
        Material mat4 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat4.setColor("Color", ColorRGBA.fromRGBA255(242, 22, 31, 1));
        geom4.setMaterial(mat4);
        
        Material mat5 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat5.setColor("Color", ColorRGBA.fromRGBA255(142, 172, 11, 1));
        geom5.setMaterial(mat5);
        
        Material mat6 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat6.setColor("Color", ColorRGBA.fromRGBA255(215, 161, 30, 1));
        geom6.setMaterial(mat6);
        
        Material mat7 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat7.setColor("Color", ColorRGBA.fromRGBA255(10, 105, 250, 1));
        geom7.setMaterial(mat7);
      
        Material mat8 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat8.setColor("Color", ColorRGBA.fromRGBA255(63, 31, 242, 1));
        geom8.setMaterial(mat8);
        
        Node viaLactea = new Node("viaLactea");
        Node orbita_mercurio = new Node("orbita_mercurio");
        Node orbita_venus = new Node("orbita_venus");
        Node orbita_tierra = new Node("orbita_tierra");
        Node orbita_marte = new Node("orbita_marte");      
        Node orbita_jupiter = new Node("orbita_jupiter");        
        Node orbita_saturno = new Node("orbita_saturno");      
        Node orbita_urano = new Node("orbita_urano");      
        Node orbita_neptuno = new Node("orbita_neptuno");   
        


        geom.scale(1);
        geom1.scale(.10f);
        geom1.move(1.2f,0,1);
        geom2.scale(.20f);
        geom2.move(2,0,2);
        geom3.scale(.30f);
        geom3.move(3,0,3);        
        geom4.scale(.40f);
        geom4.move(4,0,4); 
        geom5.scale(.75f);
        geom5.move(5,0,5);
        geom6.scale(.60f);
        geom6.move(6,0,7);
        geom7.scale(.50f);
        geom7.move(7,0,9);
        geom8.scale(.50f);
        geom8.move(8,0,10);

        
        viaLactea.attachChild(geom);
        orbita_mercurio.attachChild(geom1);
        viaLactea.attachChild(orbita_mercurio); 
        orbita_venus.attachChild(geom2);
        viaLactea.attachChild(orbita_venus);
        orbita_tierra.attachChild(geom3);
        viaLactea.attachChild(orbita_tierra);
        orbita_marte.attachChild(geom4);
        viaLactea.attachChild(orbita_marte);
        orbita_jupiter.attachChild(geom5);
        viaLactea.attachChild(orbita_jupiter);
        orbita_saturno.attachChild(geom6);
        viaLactea.attachChild(orbita_saturno);
        orbita_urano.attachChild(geom7);
        viaLactea.attachChild(orbita_urano);
        orbita_neptuno.attachChild(geom8);
        viaLactea.attachChild(orbita_neptuno);
        
        rootNode.attachChild(viaLactea);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        
        viaLactea_var = rootNode.getChild("sol");
        viaLactea_var.rotate(0,.0216f,0);
        viaLactea_var = rootNode.getChild("orbita_mercurio");
        viaLactea_var.rotate(0,.0172404f,0);
        viaLactea_var = rootNode.getChild("mercurio");
        viaLactea_var.rotate(0,-.001083f,0);
        viaLactea_var = rootNode.getChild("orbita_venus");
        viaLactea_var.rotate(0,.0126108f,0);
        viaLactea_var = rootNode.getChild("venus");
        viaLactea_var.rotate(0,.000652f,0);
        viaLactea_var = rootNode.getChild("orbita_tierra");
        viaLactea_var.rotate(0,.0107244f,0);
        viaLactea_var = rootNode.getChild("tierra");
        viaLactea_var.rotate(0,.1674f,0);
        viaLactea_var = rootNode.getChild("orbita_marte");
        viaLactea_var.rotate(0,.0086868f,0);
        viaLactea_var = rootNode.getChild("marte");
        viaLactea_var.rotate(0,.0866f,0);
        viaLactea_var = rootNode.getChild("orbita_jupiter");
        viaLactea_var.rotate(0,.0047016f,0);
        viaLactea_var = rootNode.getChild("jupiter");
        viaLactea_var.rotate(0,.0045583f,0);
        viaLactea_var = rootNode.getChild("orbita_saturno");
        viaLactea_var.rotate(0,.0034705f,0);
        viaLactea_var = rootNode.getChild("saturno");
        viaLactea_var.rotate(0,.0036840f,0);
        viaLactea_var = rootNode.getChild("orbita_urano");
        viaLactea_var.rotate(0,.0024516f,0);
        viaLactea_var = rootNode.getChild("urano");
        viaLactea_var.rotate(0,.0014794f,0);
        viaLactea_var = rootNode.getChild("orbita_neptuno");
        viaLactea_var.rotate(0,.0019548f,0);
        viaLactea_var = rootNode.getChild("neptuno");
        viaLactea_var.rotate(0,.0009719f,0);
        
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
