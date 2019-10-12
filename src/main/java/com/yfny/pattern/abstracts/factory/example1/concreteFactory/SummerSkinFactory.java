package com.yfny.pattern.abstracts.factory.example1.concreteFactory;

import com.yfny.pattern.abstracts.factory.example1.abstractFactory.SkinFactory;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.Button;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.ComboBox;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.TextField;
import com.yfny.pattern.abstracts.factory.example1.concreteProduct.summer.SummerButton;
import com.yfny.pattern.abstracts.factory.example1.concreteProduct.summer.SummerComboBox;
import com.yfny.pattern.abstracts.factory.example1.concreteProduct.summer.SummerTextField;

/**
 * Created by jisongZhou on 2019/10/12.
 **/
public class SummerSkinFactory implements SkinFactory {

    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
