#' Create a new CreateAssistantRequest
#'
#' @description
#' CreateAssistantRequest Class
#'
#' @docType class
#' @title CreateAssistantRequest
#' @description CreateAssistantRequest Class
#' @format An \code{R6Class} generator object
#' @field model  \link{CreateAssistantRequestModel}
#' @field name The name of the assistant. The maximum length is 256 characters. character [optional]
#' @field description The description of the assistant. The maximum length is 512 characters. character [optional]
#' @field instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. character [optional]
#' @field tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. list(\link{AssistantObjectToolsInner}) [optional]
#' @field file_ids A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. list(character) [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssistantRequest <- R6::R6Class(
  "CreateAssistantRequest",
  public = list(
    `model` = NULL,
    `name` = NULL,
    `description` = NULL,
    `instructions` = NULL,
    `tools` = NULL,
    `file_ids` = NULL,
    `metadata` = NULL,
    #' Initialize a new CreateAssistantRequest class.
    #'
    #' @description
    #' Initialize a new CreateAssistantRequest class.
    #'
    #' @param model model
    #' @param name The name of the assistant. The maximum length is 256 characters.
    #' @param description The description of the assistant. The maximum length is 512 characters.
    #' @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.
    #' @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.. Default to [].
    #' @param file_ids A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.. Default to [].
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`model`, `name` = NULL, `description` = NULL, `instructions` = NULL, `tools` = [], `file_ids` = [], `metadata` = NULL, ...) {
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateAssistantRequest in JSON format
    #' @export
    toJSON = function() {
      CreateAssistantRequestObject <- list()
      if (!is.null(self$`model`)) {
        CreateAssistantRequestObject[["model"]] <-
          self$`model`$toJSON()
      }
      if (!is.null(self$`name`)) {
        CreateAssistantRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CreateAssistantRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`instructions`)) {
        CreateAssistantRequestObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`tools`)) {
        CreateAssistantRequestObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toJSON())
      }
      if (!is.null(self$`file_ids`)) {
        CreateAssistantRequestObject[["file_ids"]] <-
          self$`file_ids`
      }
      if (!is.null(self$`metadata`)) {
        CreateAssistantRequestObject[["metadata"]] <-
          self$`metadata`
      }
      CreateAssistantRequestObject
    },
    #' Deserialize JSON string into an instance of CreateAssistantRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateAssistantRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateAssistantRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
          %s
          ',
          jsonlite::toJSON(self$`model`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`instructions`)) {
          sprintf(
          '"instructions":
            "%s"
                    ',
          self$`instructions`
          )
        },
        if (!is.null(self$`tools`)) {
          sprintf(
          '"tools":
          [%s]
',
          paste(sapply(self$`tools`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`file_ids`)) {
          sprintf(
          '"file_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`file_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`metadata`)) {
          sprintf(
          '"metadata":
            "%s"
                    ',
          self$`metadata`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateAssistantRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- CreateAssistantRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`instructions` <- this_object$`instructions`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self$`metadata` <- this_object$`metadata`
      self
    },
    #' Validate JSON input with respect to CreateAssistantRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateAssistantRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        stopifnot(R6::is.R6(input_json$`model`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssistantRequest: the required field `model` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssistantRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

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
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

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
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateAssistantRequest$unlock()
#
## Below is an example to define the print function
# CreateAssistantRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssistantRequest$lock()

