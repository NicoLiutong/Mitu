package com.nico.mitu.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * SharedPreferencesUtil工具类
 */

class SharedPreferencesUtil {

    private SharedPreferences sp;

    private static SharedPreferencesUtil spUtil;

    /**
     * 单列模式初始化
     * @param context
     */
    private SharedPreferencesUtil(Context context){
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static SharedPreferencesUtil getSharedPreferences(Context context){
        if(spUtil == null){
            spUtil = new SharedPreferencesUtil(context);
        }
        return spUtil;
    }

    /**
     * 移除对用键的数据
     * @param key 键
     */
    public void remove(String key){
        if(sp != null){
            sp.edit().remove(key).commit();
        }
    }

    /**
     * 保存Boolean类型的值
     * @param key 键
     * @param value 值
     */
    public void putBoolean(String key, boolean value){
        if(sp != null){
            sp.edit().putBoolean(key, value).commit();
        }
    }

    /**
     * 保存Float类型的值
     * @param key 键
     * @param value 值
     */
    public void putFloat(String key, float value){
        if(sp != null){
            sp.edit().putFloat(key, value).commit();
        }
    }

    /**
     * 保存Int类型的值
     * @param key 键
     * @param value 值
     */
    public void putInt(String key, int value){
        if(sp != null){
            sp.edit().putInt(key, value).commit();
        }
    }

    /**
     * 保存Long类型的值
     * @param key 键
     * @param value 值
     */
    public void putLong(String key, long value){
        if(sp != null){
            sp.edit().putLong(key, value).commit();
        }
    }

    /**
     * 保存String类型的值
     * @param key 键
     * @param value 值
     */
    public void putString(String key, String value){
        if(sp != null){
            sp.edit().putString(key, value).commit();
        }
    }

    /**
     * 获取String类型的值
     * @param key 键
     * @param defValue 默认值
     * @return String类型的值
     */
    public String getString(String key, String defValue){
        String value = null;
        if(sp != null){
            value = sp.getString(key, defValue);
        }
        return value;
    }

    /**
     * 获取Boolean类型的值
     * @param key 键
     * @param defValue 默认值
     * @return Boolean类型的值
     */
    public boolean getBoolean(String key, boolean defValue){
        boolean value = false;
        if(sp != null){
            value = sp.getBoolean(key, defValue);
        }
        return value;
    }

    /**
     * 获取Int类型的值
     * @param key 键
     * @param defValue 默认值
     * @return Int类型的值
     */
    public int getInt(String key, int defValue){
        int value = 0;
        if(sp != null){
            value = sp.getInt(key, defValue);
        }
        return value;
    }

    /**
     * 获取Long类型的值
     * @param key 键
     * @param defValue 默认值
     * @return Long类型的值
     */
    public long getLong(String key, long defValue){
        long value = 0;
        if(sp != null){
            value = sp.getLong(key, defValue);
        }
        return value;
    }

    /**
     * 清除所有值
     */
    public void clearAll(){
        if(sp != null){
            sp.edit().clear().commit();
        }
    }
}
