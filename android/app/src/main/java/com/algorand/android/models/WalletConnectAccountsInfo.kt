/*
 * Copyright 2019 Algorand, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License
 *
 */

package com.algorand.android.models

import com.algorand.android.utils.ALGO_DECIMALS
import java.math.BigInteger

data class WalletConnectAccountsInfo(
    val fee: Long,
    val amount: BigInteger? = null,
    val createdAssetDecimal: Long? = null,
    val transactionAmountDecimal: Int = ALGO_DECIMALS,
    val isFrozen: Boolean? = null,
    val managerAddress: BaseWalletConnectDisplayedAddress? = null,
    val reserveAddress: BaseWalletConnectDisplayedAddress? = null,
    val frozenAddress: BaseWalletConnectDisplayedAddress? = null,
    val clawbackAddress: BaseWalletConnectDisplayedAddress? = null
) {

    val safeCreateAssetDecimal: Int
        get() = createdAssetDecimal?.toInt() ?: 0
}
