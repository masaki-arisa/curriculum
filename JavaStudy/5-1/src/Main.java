import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
    
        
//      問① 下記例の配列をString型しか格納できないように修正してください。
//      現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//         例List<Object> array = new ArrayList<>();
//      また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//      <以下記述>
            List<String> array = new ArrayList<>();
            array.add("hoge");
            array.add("pos");
            array.add("foo");
            

//      問② arrayの二つ目の要素を"bar"にしましょう。
//  　<以下記述>
            //List<String> array = new ArrayList<>();
            array.add("hoge");
            array.add("bar");
            array.add("foo");
//      問③ fooが格納されているインデックスを出力してください。
//  　<以下記述>
        
        int firstFooIndex = array.indexOf("foo");
        int lastFooIndex = array.lastIndexOf("foo");
        
        if(firstFooIndex >= 0){
            System.out.println("fooのインデックス：" + firstFooIndex);
        } else {
            System.out.println("なし");
        }
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
        Map<String, String> map = new HashMap<>();
//  　<以下記述>
       map.put("hoge","/////");
       map.put("name", "kosuke");
       map.put("age", "29");
       
       

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//      <以下記述>
       for (String key : map.keySet()) {
           System.out.println("key : "+key);
       }
       
//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//      <以下記述>
       for (String val : map.values()) {
           System.out.println("valie : "+val);
       }
        
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
        Calendar cal = Calendar.getInstance();
        //List<String> list = new ArrayList<>();
        
        //list.add("2022");
        //list.add("11");
        //list.add("9");
        int arrayDate [] = new int [3];
        
        arrayDate[0] = cal.get(Calendar.YEAR);
        arrayDate[1] = cal.get(Calendar.MONTH)+1;
        arrayDate[2] = cal.get(Calendar.DATE);
        //for (String cal : cal.calendar()) {
        //System.out.println(arrayDate);
        //}
               
//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
        
        //String[] array = arraDate.split(arrayDate);
        //List [] = arrayDate;
        List<Integer> a = new ArrayList<>();
        
        a.add(arrayDate[0]);
        a.add(arrayDate[1]);
        a.add(arrayDate[2]);

 
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//      <以下記述>
      for (Integer b : a) {
           System.out.println(b);
       }
}
}
    

