CLASS cl_demo_class DEFINITION.
  PUBLIC SECTION.
    DATA: 
    	gv_counter TYPE i,                 
        gt_data TYPE TABLE OF string,      
        gv_static_data TYPE i.             

    METHODS: 
    	constructor 
	    	IMPORTING 
	    		iv_name TYPE string
	        EXPORTING 
	        	ev_message TYPE string
	        RETURNING 
	        	VALUE(rv_result) TYPE string,
        	
    	demo_method 
    		IMPORTING 
    			iv_input TYPE string    
            CHANGING 
            	cv_data TYPE i,
        
        print_data.   
                          
  PRIVATE SECTION.
    DATA: 
    	mv_name TYPE string,               
        mt_internal_table TYPE TABLE OF string, 
        ms_entry TYPE string.             
ENDCLASS.

CLASS cl_demo_class IMPLEMENTATION.
  METHOD constructor.
    mv_name = iv_name.
    ev_message = |Hello, { mv_name }!|.
    rv_result = ev_message.
  ENDMETHOD.

  METHOD demo_method.
    DATA: lv_local_variable TYPE i,                
          lo_temp_object TYPE REF TO object,       
          ls_temp_structure TYPE ty_demo_structure, 
          lt_temp_table TYPE TABLE OF string.      

    FIELD-SYMBOLS: <fs_data> TYPE string.         

    lv_local_variable = strlen( iv_input ).
    cv_data = cv_data + lv_local_variable.
    APPEND 'Sample Data' TO mt_internal_table.

    LOOP AT mt_internal_table ASSIGNING <fs_data>.
      WRITE: / |Field Symbol Data: { <fs_data> }|.
    ENDLOOP.

    LOOP AT mt_internal_table REFERENCE INTO DATA(rs_internal_entry).
      WRITE: / |Referenced Data: { rs_internal_entry->* }|.
    ENDLOOP.
  ENDMETHOD.

  METHOD print_data.
    LOOP AT mt_internal_table INTO DATA(lv_entry).
      WRITE: / lv_entry.
    ENDLOOP.
  ENDMETHOD.
ENDCLASS.
