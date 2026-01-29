#' Create a new ListAssistantFilesResponse
#'
#' @description
#' ListAssistantFilesResponse Class
#'
#' @docType class
#' @title ListAssistantFilesResponse
#' @description ListAssistantFilesResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field data  list(\link{AssistantFileObject})
#' @field first_id  character
#' @field last_id  character
#' @field has_more  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ListAssistantFilesResponse <- R6::R6Class(
  "ListAssistantFilesResponse",
  public = list(
    `object` = NULL,
    `data` = NULL,
    `first_id` = NULL,
    `last_id` = NULL,
    `has_more` = NULL,

    #' @description
    #' Initialize a new ListAssistantFilesResponse class.
    #'
    #' @param object object
    #' @param data data
    #' @param first_id first_id
    #' @param last_id last_id
    #' @param has_more has_more
    #' @param ... Other optional arguments.
    initialize = function(`object`, `data`, `first_id`, `last_id`, `has_more`, ...) {
      if (!missing(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
      if (!missing(`first_id`)) {
        if (!(is.character(`first_id`) && length(`first_id`) == 1)) {
          stop(paste("Error! Invalid data for `first_id`. Must be a string:", `first_id`))
        }
        self$`first_id` <- `first_id`
      }
      if (!missing(`last_id`)) {
        if (!(is.character(`last_id`) && length(`last_id`) == 1)) {
          stop(paste("Error! Invalid data for `last_id`. Must be a string:", `last_id`))
        }
        self$`last_id` <- `last_id`
      }
      if (!missing(`has_more`)) {
        if (!(is.logical(`has_more`) && length(`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", `has_more`))
        }
        self$`has_more` <- `has_more`
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
    #' @return ListAssistantFilesResponse as a base R list.
    #' @examples
    #' # convert array of ListAssistantFilesResponse (x) to a data frame
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
    #' Convert ListAssistantFilesResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ListAssistantFilesResponseObject <- list()
      if (!is.null(self$`object`)) {
        ListAssistantFilesResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`data`)) {
        ListAssistantFilesResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`first_id`)) {
        ListAssistantFilesResponseObject[["first_id"]] <-
          self$`first_id`
      }
      if (!is.null(self$`last_id`)) {
        ListAssistantFilesResponseObject[["last_id"]] <-
          self$`last_id`
      }
      if (!is.null(self$`has_more`)) {
        ListAssistantFilesResponseObject[["has_more"]] <-
          self$`has_more`
      }
      return(ListAssistantFilesResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ListAssistantFilesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListAssistantFilesResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[AssistantFileObject]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`first_id`)) {
        self$`first_id` <- this_object$`first_id`
      }
      if (!is.null(this_object$`last_id`)) {
        self$`last_id` <- this_object$`last_id`
      }
      if (!is.null(this_object$`has_more`)) {
        self$`has_more` <- this_object$`has_more`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ListAssistantFilesResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ListAssistantFilesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListAssistantFilesResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[AssistantFileObject]", loadNamespace("openapi"))
      self$`first_id` <- this_object$`first_id`
      self$`last_id` <- this_object$`last_id`
      self$`has_more` <- this_object$`has_more`
      self
    },

    #' @description
    #' Validate JSON input with respect to ListAssistantFilesResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListAssistantFilesResponse: the required field `object` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListAssistantFilesResponse: the required field `data` is missing."))
      }
      # check the required field `first_id`
      if (!is.null(input_json$`first_id`)) {
        if (!(is.character(input_json$`first_id`) && length(input_json$`first_id`) == 1)) {
          stop(paste("Error! Invalid data for `first_id`. Must be a string:", input_json$`first_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListAssistantFilesResponse: the required field `first_id` is missing."))
      }
      # check the required field `last_id`
      if (!is.null(input_json$`last_id`)) {
        if (!(is.character(input_json$`last_id`) && length(input_json$`last_id`) == 1)) {
          stop(paste("Error! Invalid data for `last_id`. Must be a string:", input_json$`last_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListAssistantFilesResponse: the required field `last_id` is missing."))
      }
      # check the required field `has_more`
      if (!is.null(input_json$`has_more`)) {
        if (!(is.logical(input_json$`has_more`) && length(input_json$`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", input_json$`has_more`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListAssistantFilesResponse: the required field `has_more` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ListAssistantFilesResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      # check if the required `first_id` is null
      if (is.null(self$`first_id`)) {
        return(FALSE)
      }

      # check if the required `last_id` is null
      if (is.null(self$`last_id`)) {
        return(FALSE)
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      # check if the required `first_id` is null
      if (is.null(self$`first_id`)) {
        invalid_fields["first_id"] <- "Non-nullable required field `first_id` cannot be null."
      }

      # check if the required `last_id` is null
      if (is.null(self$`last_id`)) {
        invalid_fields["last_id"] <- "Non-nullable required field `last_id` cannot be null."
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
        invalid_fields["has_more"] <- "Non-nullable required field `has_more` cannot be null."
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
# ListAssistantFilesResponse$unlock()
#
## Below is an example to define the print function
# ListAssistantFilesResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ListAssistantFilesResponse$lock()

