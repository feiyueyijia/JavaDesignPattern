package com.yfny.pattern.abstracts.factory.example1.abstractFactory;

import com.yfny.pattern.abstracts.factory.example1.abstractProduct.Button;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.ComboBox;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.TextField;

/**
 * Created by jisongZhou on 2019/10/12.
 **/
public interface SkinFactory {

    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();

}
