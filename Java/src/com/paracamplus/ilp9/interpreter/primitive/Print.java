package com.paracamplus.ilp9.interpreter.primitive;

import java.io.IOException;
import java.io.Writer;

import com.paracamplus.ilp9.interpreter.EvaluationException;

public class Print extends UnaryPrimitive {
    
    public Print(Writer out) {
        super("print");
        this.out = out;
    }
    private final Writer out;
        
    public Object apply (Object value) throws EvaluationException {
        try {
            out.append(value.toString());
        } catch (IOException e) {
            throw new EvaluationException(e);
        }
        return Boolean.FALSE;
    }
}