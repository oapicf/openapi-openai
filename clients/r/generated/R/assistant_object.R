#' Create a new AssistantObject
#'
#' @description
#' Represents an `assistant` that can call the model and use tools.
#'
#' @docType class
#' @title AssistantObject
#' @description AssistantObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field object The object type, which is always `assistant`. character
#' @field created_at The Unix timestamp (in seconds) for when the assistant was created. integer
#' @field name The name of the assistant. The maximum length is 256 characters. character
#' @field description The description of the assistant. The maximum length is 512 characters. character
#' @field model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. character
#' @field instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. character
#' @field tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. list(\link{AssistantObjectToolsInner})
#' @field tool_resources  \link{AssistantObjectToolResources} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object
#' @field temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. numeric [optional]
#' @field top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or temperature but not both. numeric [optional]
#' @field response_format  \link{AssistantsApiResponseFormatOption} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantObject <- R6::R6Class(
  "AssistantObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `name` = NULL,
    `description` = NULL,
    `model` = NULL,
    `instructions` = NULL,
    `tools` = NULL,
    `tool_resources` = NULL,
    `metadata` = NULL,
    `temperature` = NULL,
    `top_p` = NULL,
    `response_format` = NULL,

    #' @description
    #' Initialize a new AssistantObject class.
    #'
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param object The object type, which is always `assistant`.
    #' @param created_at The Unix timestamp (in seconds) for when the assistant was created.
    #' @param name The name of the assistant. The maximum length is 256 characters.
    #' @param description The description of the assistant. The maximum length is 512 characters.
    #' @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.
    #' @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.
    #' @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param tool_resources tool_resources
    #' @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.. Default to 1.
    #' @param top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or temperature but not both.. Default to 1.
    #' @param response_format response_format
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `created_at`, `name`, `description`, `model`, `instructions`, `tools`, `metadata`, `tool_resources` = NULL, `temperature` = 1, `top_p` = 1, `response_format` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("assistant"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"assistant\".", sep = ""))
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
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`instructions`)) {
        if (!(is.character(`instructions`) && length(`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", `instructions`))
        }
        self$`instructions` <- `instructions`
      }
      if (!missing(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
      }
      if (!missing(`metadata`)) {
        self$`metadata` <- `metadata`
      }
      if (!is.null(`tool_resources`)) {
        stopifnot(R6::is.R6(`tool_resources`))
        self$`tool_resources` <- `tool_resources`
      }
      if (!is.null(`temperature`)) {
        self$`temperature` <- `temperature`
      }
      if (!is.null(`top_p`)) {
        self$`top_p` <- `top_p`
      }
      if (!is.null(`response_format`)) {
        stopifnot(R6::is.R6(`response_format`))
        self$`response_format` <- `response_format`
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
    #' @return AssistantObject as a base R list.
    #' @examples
    #' # convert array of AssistantObject (x) to a data frame
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
    #' Convert AssistantObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssistantObjectObject <- list()
      if (!is.null(self$`id`)) {
        AssistantObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        AssistantObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        AssistantObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`name`)) {
        AssistantObjectObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        AssistantObjectObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`model`)) {
        AssistantObjectObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`instructions`)) {
        AssistantObjectObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`tools`)) {
        AssistantObjectObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`tool_resources`)) {
        AssistantObjectObject[["tool_resources"]] <-
          self$`tool_resources`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        AssistantObjectObject[["metadata"]] <-
          self$`metadata`
      }
      if (!is.null(self$`temperature`)) {
        AssistantObjectObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`top_p`)) {
        AssistantObjectObject[["top_p"]] <-
          self$`top_p`
      }
      if (!is.null(self$`response_format`)) {
        AssistantObjectObject[["response_format"]] <-
          self$`response_format`$toSimpleType()
      }
      return(AssistantObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("assistant"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"assistant\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`instructions`)) {
        self$`instructions` <- this_object$`instructions`
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tool_resources`)) {
        `tool_resources_object` <- AssistantObjectToolResources$new()
        `tool_resources_object`$fromJSON(jsonlite::toJSON(this_object$`tool_resources`, auto_unbox = TRUE, digits = NA))
        self$`tool_resources` <- `tool_resources_object`
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      if (!is.null(this_object$`temperature`)) {
        self$`temperature` <- this_object$`temperature`
      }
      if (!is.null(this_object$`top_p`)) {
        self$`top_p` <- this_object$`top_p`
      }
      if (!is.null(this_object$`response_format`)) {
        `response_format_object` <- AssistantsApiResponseFormatOption$new()
        `response_format_object`$fromJSON(jsonlite::toJSON(this_object$`response_format`, auto_unbox = TRUE, digits = NA))
        self$`response_format` <- `response_format_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssistantObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("assistant"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"assistant\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`model` <- this_object$`model`
      self$`instructions` <- this_object$`instructions`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      self$`tool_resources` <- AssistantObjectToolResources$new()$fromJSON(jsonlite::toJSON(this_object$`tool_resources`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self$`temperature` <- this_object$`temperature`
      self$`top_p` <- this_object$`top_p`
      self$`response_format` <- AssistantsApiResponseFormatOption$new()$fromJSON(jsonlite::toJSON(this_object$`response_format`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssistantObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `created_at` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `name` is missing."))
      }
      # check the required field `description`
      if (!is.null(input_json$`description`)) {
        if (!(is.character(input_json$`description`) && length(input_json$`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", input_json$`description`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `description` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `model` is missing."))
      }
      # check the required field `instructions`
      if (!is.null(input_json$`instructions`)) {
        if (!(is.character(input_json$`instructions`) && length(input_json$`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", input_json$`instructions`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `instructions` is missing."))
      }
      # check the required field `tools`
      if (!is.null(input_json$`tools`)) {
        stopifnot(is.vector(input_json$`tools`), length(input_json$`tools`) != 0)
        tmp <- sapply(input_json$`tools`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `tools` is missing."))
      }
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `metadata` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantObject
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

      if (nchar(self$`name`) > 256) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 512) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      if (nchar(self$`instructions`) > 256000) {
        return(FALSE)
      }

      # check if the required `tools` is null
      if (is.null(self$`tools`)) {
        return(FALSE)
      }

      if (length(self$`tools`) > 128) {
        return(FALSE)
      }

      if (self$`temperature` > 2) {
        return(FALSE)
      }
      if (self$`temperature` < 0) {
        return(FALSE)
      }

      if (self$`top_p` > 1) {
        return(FALSE)
      }
      if (self$`top_p` < 0) {
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

      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
      }

      if (nchar(self$`description`) > 512) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 512."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      if (nchar(self$`instructions`) > 256000) {
        invalid_fields["instructions"] <- "Invalid length for `instructions`, must be smaller than or equal to 256000."
      }

      # check if the required `tools` is null
      if (is.null(self$`tools`)) {
        invalid_fields["tools"] <- "Non-nullable required field `tools` cannot be null."
      }

      if (length(self$`tools`) > 128) {
        invalid_fields["tools"] <- "Invalid length for `tools`, number of items must be less than or equal to 128."
      }

      if (self$`temperature` > 2) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be smaller than or equal to 2."
      }
      if (self$`temperature` < 0) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be bigger than or equal to 0."
      }

      if (self$`top_p` > 1) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be smaller than or equal to 1."
      }
      if (self$`top_p` < 0) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be bigger than or equal to 0."
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
# AssistantObject$unlock()
#
## Below is an example to define the print function
# AssistantObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantObject$lock()

