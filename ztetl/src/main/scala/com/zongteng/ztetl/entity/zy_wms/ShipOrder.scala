package com.zongteng.ztetl.entity.zy_wms

case class ShipOrder(
                      so_id: String,
                      so_code: String,
                      sc_id: String,
                      order_id: String,
                      order_code: String,
                      sp_code: String,
                      service_number: String,
                      tracking_number: String,
                      warehouse_id: String,
                      pp_barcode: String,
                      sm_code: String,
                      so_status: String,
                      service_provider_weight: String,
                      so_weight: String,
                      so_vol_weight: String,
                      so_length: String,
                      so_width: String,
                      so_height: String,
                      so_declared_value: String,
                      so_insurance_value: String,
                      so_tariff_fee: String,
                      so_shipping_fee: String,
                      currency_code: String,
                      currency_rate: String,
                      so_add_time: String,
                      so_ship_time: String,
                      so_delivered_time: String,
                      so_update_time: String,
                      so_timestamp: String
                    )
