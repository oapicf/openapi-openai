#' Create a new MessageObject
#'
#' @description
#' Represents a message within a [thread](/docs/api-reference/threads).
#'
#' @docType class
#' @title MessageObject
#' @description MessageObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field object The object type, which is always `thread.message`. character
#' @field created_at The Unix timestamp (in seconds) for when the message was created. integer
#' @field thread_id The [thread](/docs/api-reference/threads) ID that this message belongs to. character
#' @field status The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. character
#' @field incomplete_details  \link{MessageObjectIncompleteDetails}
#' @field completed_at The Unix timestamp (in seconds) for when the message was completed. integer
#' @field incomplete_at The Unix timestamp (in seconds) for when the message was marked as incomplete. integer
#' @field role The entity that produced the message. One of `user` or `assistant`. character
#' @field content The content of the message in array of text and/or images. list(\link{MessageObjectContentInner})
#' @field assistant_id If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. character
#' @field run_id The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. character
#' @field attachments A list of files attached to the message, and the tools they were added to. list(\link{CreateMessageRequestAttachmentsInner})
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageObject <- R6::R6Class(
  "MessageObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `thread_id` = NULL,
    `status` = NULL,
    `incomplete_details` = NULL,
    `completed_at` = NULL,
    `incomplete_at` = NULL,
    `role` = NULL,
    `content` = NULL,
    `assistant_id` = NULL,
    `run_id` = NULL,
    `attachments` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new MessageObject class.
    #'
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param object The object type, which is always `thread.message`.
    #' @param created_at The Unix timestamp (in seconds) for when the message was created.
    #' @param thread_id The [thread](/docs/api-reference/threads) ID that this message belongs to.
    #' @param status The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
    #' @param incomplete_details incomplete_details
    #' @param completed_at The Unix timestamp (in seconds) for when the message was completed.
    #' @param incomplete_at The Unix timestamp (in seconds) for when the message was marked as incomplete.
    #' @param role The entity that produced the message. One of `user` or `assistant`.
    #' @param content The content of the message in array of text and/or images.
    #' @param assistant_id If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
    #' @param run_id The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
    #' @param attachments A list of files attached to the message, and the tools they were added to.
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `created_at`, `thread_id`, `status`, `incomplete_details`, `completed_at`, `incomplete_at`, `role`, `content`, `assistant_id`, `run_id`, `attachments`, `metadata`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("thread.message"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"thread.message\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`thread_id`)) {
        if (!(is.character(`thread_id`) && length(`thread_id`) == 1)) {
          stop(paste("Error! Invalid data for `thread_id`. Must be a string:", `thread_id`))
        }
        self$`thread_id` <- `thread_id`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("in_progress", "incomplete", "completed"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"incomplete\", \"completed\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`incomplete_details`)) {
        stopifnot(R6::is.R6(`incomplete_details`))
        self$`incomplete_details` <- `incomplete_details`
      }
      if (!missing(`completed_at`)) {
        if (!(is.numeric(`completed_at`) && length(`completed_at`) == 1)) {
          stop(paste("Error! Invalid data for `completed_at`. Must be an integer:", `completed_at`))
        }
        self$`completed_at` <- `completed_at`
      }
      if (!missing(`incomplete_at`)) {
        if (!(is.numeric(`incomplete_at`) && length(`incomplete_at`) == 1)) {
          stop(paste("Error! Invalid data for `incomplete_at`. Must be an integer:", `incomplete_at`))
        }
        self$`incomplete_at` <- `incomplete_at`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("user", "assistant"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"user\", \"assistant\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!missing(`content`)) {
        stopifnot(is.vector(`content`), length(`content`) != 0)
        sapply(`content`, function(x) stopifnot(R6::is.R6(x)))
        self$`content` <- `content`
      }
      if (!missing(`assistant_id`)) {
        if (!(is.character(`assistant_id`) && length(`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", `assistant_id`))
        }
        self$`assistant_id` <- `assistant_id`
      }
      if (!missing(`run_id`)) {
        if (!(is.character(`run_id`) && length(`run_id`) == 1)) {
          stop(paste("Error! Invalid data for `run_id`. Must be a string:", `run_id`))
        }
        self$`run_id` <- `run_id`
      }
      if (!missing(`attachments`)) {
        stopifnot(is.vector(`attachments`), length(`attachments`) != 0)
        sapply(`attachments`, function(x) stopifnot(R6::is.R6(x)))
        self$`attachments` <- `attachments`
      }
      if (!missing(`metadata`)) {
        self$`metadata` <- `metadata`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return MessageObject as a base R list.
    #' @examples
    #' # convert array of MessageObject (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert MessageObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageObjectObject <- list()
      if (!is.null(self$`id`)) {
        MessageObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        MessageObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        MessageObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`thread_id`)) {
        MessageObjectObject[["thread_id"]] <-
          self$`thread_id`
      }
      if (!is.null(self$`status`)) {
        MessageObjectObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`incomplete_details`)) {
        MessageObjectObject[["incomplete_details"]] <-
          self$`incomplete_details`$toSimpleType()
      }
      if (!is.null(self$`completed_at`)) {
        MessageObjectObject[["completed_at"]] <-
          self$`completed_at`
      }
      if (!is.null(self$`incomplete_at`)) {
        MessageObjectObject[["incomplete_at"]] <-
          self$`incomplete_at`
      }
      if (!is.null(self$`role`)) {
        MessageObjectObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`content`)) {
        MessageObjectObject[["content"]] <-
          lapply(self$`content`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`assistant_id`)) {
        MessageObjectObject[["assistant_id"]] <-
          self$`assistant_id`
      }
      if (!is.null(self$`run_id`)) {
        MessageObjectObject[["run_id"]] <-
          self$`run_id`
      }
      if (!is.null(self$`attachments`)) {
        MessageObjectObject[["attachments"]] <-
          lapply(self$`attachments`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`metadata`)) {
        MessageObjectObject[["metadata"]] <-
          self$`metadata`
      }
      return(MessageObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`thread_id`)) {
        self$`thread_id` <- this_object$`thread_id`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("in_progress", "incomplete", "completed"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"incomplete\", \"completed\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`incomplete_details`)) {
        `incomplete_details_object` <- MessageObjectIncompleteDetails$new()
        `incomplete_details_object`$fromJSON(jsonlite::toJSON(this_object$`incomplete_details`, auto_unbox = TRUE, digits = NA))
        self$`incomplete_details` <- `incomplete_details_object`
      }
      if (!is.null(this_object$`completed_at`)) {
        self$`completed_at` <- this_object$`completed_at`
      }
      if (!is.null(this_object$`incomplete_at`)) {
        self$`incomplete_at` <- this_object$`incomplete_at`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("user", "assistant"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"user\", \"assistant\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`content`)) {
        self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[MessageObjectContentInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`assistant_id`)) {
        self$`assistant_id` <- this_object$`assistant_id`
      }
      if (!is.null(this_object$`run_id`)) {
        self$`run_id` <- this_object$`run_id`
      }
      if (!is.null(this_object$`attachments`)) {
        self$`attachments` <- ApiClient$new()$deserializeObj(this_object$`attachments`, "array[CreateMessageRequestAttachmentsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MessageObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`thread_id` <- this_object$`thread_id`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("in_progress", "incomplete", "completed"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"incomplete\", \"completed\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`incomplete_details` <- MessageObjectIncompleteDetails$new()$fromJSON(jsonlite::toJSON(this_object$`incomplete_details`, auto_unbox = TRUE, digits = NA))
      self$`completed_at` <- this_object$`completed_at`
      self$`incomplete_at` <- this_object$`incomplete_at`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("user", "assistant"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"user\", \"assistant\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[MessageObjectContentInner]", loadNamespace("openapi"))
      self$`assistant_id` <- this_object$`assistant_id`
      self$`run_id` <- this_object$`run_id`
      self$`attachments` <- ApiClient$new()$deserializeObj(this_object$`attachments`, "array[CreateMessageRequestAttachmentsInner]", loadNamespace("openapi"))
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `created_at` is missing."))
      }
      # check the required field `thread_id`
      if (!is.null(input_json$`thread_id`)) {
        if (!(is.character(input_json$`thread_id`) && length(input_json$`thread_id`) == 1)) {
          stop(paste("Error! Invalid data for `thread_id`. Must be a string:", input_json$`thread_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `thread_id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `status` is missing."))
      }
      # check the required field `incomplete_details`
      if (!is.null(input_json$`incomplete_details`)) {
        stopifnot(R6::is.R6(input_json$`incomplete_details`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `incomplete_details` is missing."))
      }
      # check the required field `completed_at`
      if (!is.null(input_json$`completed_at`)) {
        if (!(is.numeric(input_json$`completed_at`) && length(input_json$`completed_at`) == 1)) {
          stop(paste("Error! Invalid data for `completed_at`. Must be an integer:", input_json$`completed_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `completed_at` is missing."))
      }
      # check the required field `incomplete_at`
      if (!is.null(input_json$`incomplete_at`)) {
        if (!(is.numeric(input_json$`incomplete_at`) && length(input_json$`incomplete_at`) == 1)) {
          stop(paste("Error! Invalid data for `incomplete_at`. Must be an integer:", input_json$`incomplete_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `incomplete_at` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `role` is missing."))
      }
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        stopifnot(is.vector(input_json$`content`), length(input_json$`content`) != 0)
        tmp <- sapply(input_json$`content`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `content` is missing."))
      }
      # check the required field `assistant_id`
      if (!is.null(input_json$`assistant_id`)) {
        if (!(is.character(input_json$`assistant_id`) && length(input_json$`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", input_json$`assistant_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `assistant_id` is missing."))
      }
      # check the required field `run_id`
      if (!is.null(input_json$`run_id`)) {
        if (!(is.character(input_json$`run_id`) && length(input_json$`run_id`) == 1)) {
          stop(paste("Error! Invalid data for `run_id`. Must be a string:", input_json$`run_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `run_id` is missing."))
      }
      # check the required field `attachments`
      if (!is.null(input_json$`attachments`)) {
        stopifnot(is.vector(input_json$`attachments`), length(input_json$`attachments`) != 0)
        tmp <- sapply(input_json$`attachments`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `attachments` is missing."))
      }
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObject: the required field `metadata` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `thread_id` is null
      if (is.null(self$`thread_id`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        return(FALSE)
      }

      # check if the required `content` is null
      if (is.null(self$`content`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `thread_id` is null
      if (is.null(self$`thread_id`)) {
        invalid_fields["thread_id"] <- "Non-nullable required field `thread_id` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
      }

      # check if the required `content` is null
      if (is.null(self$`content`)) {
        invalid_fields["content"] <- "Non-nullable required field `content` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# MessageObject$unlock()
#
## Below is an example to define the print function
# MessageObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageObject$lock()

