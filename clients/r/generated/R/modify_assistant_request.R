#' Create a new ModifyAssistantRequest
#'
#' @description
#' ModifyAssistantRequest Class
#'
#' @docType class
#' @title ModifyAssistantRequest
#' @description ModifyAssistantRequest Class
#' @format An \code{R6Class} generator object
#' @field model  character [optional]
#' @field name The name of the assistant. The maximum length is 256 characters. character [optional]
#' @field description The description of the assistant. The maximum length is 512 characters. character [optional]
#' @field instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. character [optional]
#' @field tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. list(\link{AssistantObjectToolsInner}) [optional]
#' @field tool_resources  \link{ModifyAssistantRequestToolResources} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object [optional]
#' @field temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. numeric [optional]
#' @field top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or temperature but not both. numeric [optional]
#' @field response_format  \link{AssistantsApiResponseFormatOption} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModifyAssistantRequest <- R6::R6Class(
  "ModifyAssistantRequest",
  public = list(
    `model` = NULL,
    `name` = NULL,
    `description` = NULL,
    `instructions` = NULL,
    `tools` = NULL,
    `tool_resources` = NULL,
    `metadata` = NULL,
    `temperature` = NULL,
    `top_p` = NULL,
    `response_format` = NULL,

    #' @description
    #' Initialize a new ModifyAssistantRequest class.
    #'
    #' @param model model
    #' @param name The name of the assistant. The maximum length is 256 characters.
    #' @param description The description of the assistant. The maximum length is 512 characters.
    #' @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.
    #' @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.. Default to [].
    #' @param tool_resources tool_resources
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.. Default to 1.
    #' @param top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or temperature but not both.. Default to 1.
    #' @param response_format response_format
    #' @param ... Other optional arguments.
    initialize = function(`model` = NULL, `name` = NULL, `description` = NULL, `instructions` = NULL, `tools` = [], `tool_resources` = NULL, `metadata` = NULL, `temperature` = 1, `top_p` = 1, `response_format` = NULL, ...) {
      if (!is.null(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`instructions`)) {
        if (!(is.character(`instructions`) && length(`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", `instructions`))
        }
        self$`instructions` <- `instructions`
      }
      if (!is.null(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
      }
      if (!is.null(`tool_resources`)) {
        stopifnot(R6::is.R6(`tool_resources`))
        self$`tool_resources` <- `tool_resources`
      }
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
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
    #' @return ModifyAssistantRequest as a base R list.
    #' @examples
    #' # convert array of ModifyAssistantRequest (x) to a data frame
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
    #' Convert ModifyAssistantRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ModifyAssistantRequestObject <- list()
      if (!is.null(self$`model`)) {
        ModifyAssistantRequestObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`name`)) {
        ModifyAssistantRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        ModifyAssistantRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`instructions`)) {
        ModifyAssistantRequestObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`tools`)) {
        ModifyAssistantRequestObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`tool_resources`)) {
        ModifyAssistantRequestObject[["tool_resources"]] <-
          self$`tool_resources`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        ModifyAssistantRequestObject[["metadata"]] <-
          self$`metadata`
      }
      if (!is.null(self$`temperature`)) {
        ModifyAssistantRequestObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`top_p`)) {
        ModifyAssistantRequestObject[["top_p"]] <-
          self$`top_p`
      }
      if (!is.null(self$`response_format`)) {
        ModifyAssistantRequestObject[["response_format"]] <-
          self$`response_format`$toSimpleType()
      }
      return(ModifyAssistantRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyAssistantRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyAssistantRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`instructions`)) {
        self$`instructions` <- this_object$`instructions`
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tool_resources`)) {
        `tool_resources_object` <- ModifyAssistantRequestToolResources$new()
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
    #' @return ModifyAssistantRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyAssistantRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyAssistantRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- this_object$`model`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`instructions` <- this_object$`instructions`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      self$`tool_resources` <- ModifyAssistantRequestToolResources$new()$fromJSON(jsonlite::toJSON(this_object$`tool_resources`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self$`temperature` <- this_object$`temperature`
      self$`top_p` <- this_object$`top_p`
      self$`response_format` <- AssistantsApiResponseFormatOption$new()$fromJSON(jsonlite::toJSON(this_object$`response_format`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ModifyAssistantRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ModifyAssistantRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`name`) > 256) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 512) {
        return(FALSE)
      }

      if (nchar(self$`instructions`) > 256000) {
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
      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
      }

      if (nchar(self$`description`) > 512) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 512."
      }

      if (nchar(self$`instructions`) > 256000) {
        invalid_fields["instructions"] <- "Invalid length for `instructions`, must be smaller than or equal to 256000."
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
# ModifyAssistantRequest$unlock()
#
## Below is an example to define the print function
# ModifyAssistantRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModifyAssistantRequest$lock()

