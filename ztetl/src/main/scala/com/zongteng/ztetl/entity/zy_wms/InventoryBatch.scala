package com.zongteng.ztetl.entity.zy_wms

case class InventoryBatch (
                            ib_id:String,
                            lc_code:String,
                            product_id:String,
                            box_code:String,
                            product_barcode:String,
                            customer_code_own:String,
                            reference_no:String,
                            application_code:String,
                            supplier_id:String,
                            warehouse_id:String,
                            receiving_code:String,
                            receiving_id:String,
                            po_code:String,
                            lot_number:String,
                            ib_type:String,
                            ib_status:String,
                            ib_hold_status:String,
                            ib_quantity:String,
                            ib_fifo_time:String,
                            ib_note:String,
                            ib_add_time:String,
                            ib_update_time:String,
                            transit_receiving_code:String,
                            ib_timestamp:String
                          )
