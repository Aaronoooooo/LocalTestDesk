package com.zongteng.ztetl.entity.gc_owms.gc_owms_frvi

case class Picking (
    picking_id: String,
    warehouse_id: String,
    picking_code: String,
    print_quantity: String,
    picker_id: String,
    creater_id: String,
    picking_order_cnt: String,
    picking_lc_cnt: String,
    picking_item_cnt: String,
    osot_code_str: String,
    picking_mode: String,
    picking_status: String,
    picking_sync_status: String,
    picking_sync_time: String,
    is_assign: String,
    picking_pack_check: String,
    picking_type: String,
    picking_add_time: String,
    picking_update_time: String,
    is_more_box: String,
    is_print: String,
    picking_sort: String,
    task_id: String,
    wellen_code: String,
    sorting_mode: String,
    sorting_status: String,
    sorting_time: String,
    sorting_user_id: String,
    sorting_count: String,
    is_run_picking: String,
    is_cross_warehouse: String,
    operate_status: String,
    is_supplement: String,
    ct_id: String,
    bind_container_time: String,
    new_task_id: String,
    lc_level_type: String,
    is_fba: String,
    fba_pick_type: String
)
