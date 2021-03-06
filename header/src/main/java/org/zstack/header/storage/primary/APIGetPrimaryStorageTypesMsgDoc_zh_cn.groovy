package org.zstack.header.storage.primary

doc {
    title "获取主存储类型列表(GetPrimaryStorageTypes)"

    category "storage.primary"

    desc "获取主存储类型列表"

    rest {
        request {
			url "GET /v1/primary-storage/types"


            header (OAuth: 'the-session-uuid')

            clz APIGetPrimaryStorageTypesMsg.class

            desc ""
            
			params {

				column {
					name "systemTags"
					enclosedIn "params"
					desc "系统标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn "params"
					desc "用户标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIGetPrimaryStorageTypesReply.class
        }
    }
}