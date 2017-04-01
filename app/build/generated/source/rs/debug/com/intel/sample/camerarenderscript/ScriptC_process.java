/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /home/vinay/AndroidStudioProjects/CameraRenderScript/app/src/main/rs/process.rs
 */

package com.intel.sample.camerarenderscript;

import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_process extends ScriptC {
    private static final String __rs_resource_name = "process";
    // Constructor
    public  ScriptC_process(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_process(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_normU8 = 0.00392156886f;
        __F32 = Element.F32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_imageWidth = 0;
    private int mExportVar_imageWidth;
    public synchronized void set_imageWidth(int v) {
        setVar(mExportVarIdx_imageWidth, v);
        mExportVar_imageWidth = v;
    }

    public int get_imageWidth() {
        return mExportVar_imageWidth;
    }

    public Script.FieldID getFieldID_imageWidth() {
        return createFieldID(mExportVarIdx_imageWidth, null);
    }

    private final static int mExportVarIdx_imageHeight = 1;
    private int mExportVar_imageHeight;
    public synchronized void set_imageHeight(int v) {
        setVar(mExportVarIdx_imageHeight, v);
        mExportVar_imageHeight = v;
    }

    public int get_imageHeight() {
        return mExportVar_imageHeight;
    }

    public Script.FieldID getFieldID_imageHeight() {
        return createFieldID(mExportVarIdx_imageHeight, null);
    }

    private final static int mExportVarIdx_RGBABuffer = 2;
    private Allocation mExportVar_RGBABuffer;
    public synchronized void set_RGBABuffer(Allocation v) {
        setVar(mExportVarIdx_RGBABuffer, v);
        mExportVar_RGBABuffer = v;
    }

    public Allocation get_RGBABuffer() {
        return mExportVar_RGBABuffer;
    }

    public Script.FieldID getFieldID_RGBABuffer() {
        return createFieldID(mExportVarIdx_RGBABuffer, null);
    }

    private final static int mExportVarIdx_gLookup = 3;
    private Allocation mExportVar_gLookup;
    public synchronized void set_gLookup(Allocation v) {
        setVar(mExportVarIdx_gLookup, v);
        mExportVar_gLookup = v;
    }

    public Allocation get_gLookup() {
        return mExportVar_gLookup;
    }

    public Script.FieldID getFieldID_gLookup() {
        return createFieldID(mExportVarIdx_gLookup, null);
    }

    private final static int mExportVarIdx_normU8 = 4;
    private float mExportVar_normU8;
    public final static float const_normU8 = 0.00392156886f;
    public float get_normU8() {
        return mExportVar_normU8;
    }

    public Script.FieldID getFieldID_normU8() {
        return createFieldID(mExportVarIdx_normU8, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_filter = 1;
    public Script.KernelID getKernelID_filter() {
        return createKernelID(mExportForEachIdx_filter, 59, null, null);
    }

    public void forEach_filter(Allocation ain, Allocation aout) {
        forEach_filter(ain, aout, null);
    }

    public void forEach_filter(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_filter, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_skinProbability = 2;
    public Script.KernelID getKernelID_skinProbability() {
        return createKernelID(mExportForEachIdx_skinProbability, 59, null, null);
    }

    public void forEach_skinProbability(Allocation ain, Allocation aout) {
        forEach_skinProbability(ain, aout, null);
    }

    public void forEach_skinProbability(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_skinProbability, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_update_state = 0;
    public void invoke_update_state() {
        invoke(mExportFuncIdx_update_state);
    }

}

