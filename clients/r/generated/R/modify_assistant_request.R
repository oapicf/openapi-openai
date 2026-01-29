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
#' @field tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. list(\link{AssistantObjectToolsInner}) [optional]
#' @field file_ids A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. list(character) [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object [optional]
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
    `file_ids` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new ModifyAssistantRequest class.
    #'
    #' @param model model
    #' @param name The name of the assistant. The maximum length is 256 characters.
    #' @param description The description of the assistant. The maximum length is 512 characters.
    #' @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.
    #' @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.. Default to [].
    #' @param file_ids A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.. Default to [].
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`model` = NULL, `name` = NULL, `description` = NULL, `instructions` = NULL, `tools` = [], `file_ids` = [], `metadata` = NULL, ...) {
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
      if (!is.null(`file_ids`)) {
        stopifnot(is.vector(`file_ids`), length(`file_ids`) != 0)
        sapply(`file_ids`, function(x) stopifnot(is.character(x)))
        self$`file_ids` <- `file_ids`
      }
      if (!is.null(`metadata`)) {
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
      if (!is.null(self$`file_ids`)) {
        ModifyAssistantRequestObject[["file_ids"]] <-
          self$`file_ids`
      }
      if (!is.null(self$`metadata`)) {
        ModifyAssistantRequestObject[["metadata"]] <-
          self$`metadata`
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
      if (!is.null(this_object$`file_ids`)) {
        self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
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
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self$`metadata` <- this_object$`metadata`
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

      if (length(self$`file_ids`) > 20) {
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

      if (length(self$`file_ids`) > 20) {
        invalid_fields["file_ids"] <- "Invalid length for `file_ids`, number of items must be less than or equal to 20."
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

