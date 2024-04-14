#' Create a new ListFineTuningJobCheckpointsResponse
#'
#' @description
#' ListFineTuningJobCheckpointsResponse Class
#'
#' @docType class
#' @title ListFineTuningJobCheckpointsResponse
#' @description ListFineTuningJobCheckpointsResponse Class
#' @format An \code{R6Class} generator object
#' @field data  list(\link{FineTuningJobCheckpoint})
#' @field object  character
#' @field first_id  character [optional]
#' @field last_id  character [optional]
#' @field has_more  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ListFineTuningJobCheckpointsResponse <- R6::R6Class(
  "ListFineTuningJobCheckpointsResponse",
  public = list(
    `data` = NULL,
    `object` = NULL,
    `first_id` = NULL,
    `last_id` = NULL,
    `has_more` = NULL,
    #' Initialize a new ListFineTuningJobCheckpointsResponse class.
    #'
    #' @description
    #' Initialize a new ListFineTuningJobCheckpointsResponse class.
    #'
    #' @param data data
    #' @param object object
    #' @param has_more has_more
    #' @param first_id first_id
    #' @param last_id last_id
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`data`, `object`, `has_more`, `first_id` = NULL, `last_id` = NULL, ...) {
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("list"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`has_more`)) {
        if (!(is.logical(`has_more`) && length(`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", `has_more`))
        }
        self$`has_more` <- `has_more`
      }
      if (!is.null(`first_id`)) {
        if (!(is.character(`first_id`) && length(`first_id`) == 1)) {
          stop(paste("Error! Invalid data for `first_id`. Must be a string:", `first_id`))
        }
        self$`first_id` <- `first_id`
      }
      if (!is.null(`last_id`)) {
        if (!(is.character(`last_id`) && length(`last_id`) == 1)) {
          stop(paste("Error! Invalid data for `last_id`. Must be a string:", `last_id`))
        }
        self$`last_id` <- `last_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListFineTuningJobCheckpointsResponse in JSON format
    #' @export
    toJSON = function() {
      ListFineTuningJobCheckpointsResponseObject <- list()
      if (!is.null(self$`data`)) {
        ListFineTuningJobCheckpointsResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toJSON())
      }
      if (!is.null(self$`object`)) {
        ListFineTuningJobCheckpointsResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`first_id`)) {
        ListFineTuningJobCheckpointsResponseObject[["first_id"]] <-
          self$`first_id`
      }
      if (!is.null(self$`last_id`)) {
        ListFineTuningJobCheckpointsResponseObject[["last_id"]] <-
          self$`last_id`
      }
      if (!is.null(self$`has_more`)) {
        ListFineTuningJobCheckpointsResponseObject[["has_more"]] <-
          self$`has_more`
      }
      ListFineTuningJobCheckpointsResponseObject
    },
    #' Deserialize JSON string into an instance of ListFineTuningJobCheckpointsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListFineTuningJobCheckpointsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListFineTuningJobCheckpointsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[FineTuningJobCheckpoint]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("list"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
        }
        self$`object` <- this_object$`object`
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListFineTuningJobCheckpointsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          [%s]
',
          paste(sapply(self$`data`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        },
        if (!is.null(self$`first_id`)) {
          sprintf(
          '"first_id":
            "%s"
                    ',
          self$`first_id`
          )
        },
        if (!is.null(self$`last_id`)) {
          sprintf(
          '"last_id":
            "%s"
                    ',
          self$`last_id`
          )
        },
        if (!is.null(self$`has_more`)) {
          sprintf(
          '"has_more":
            %s
                    ',
          tolower(self$`has_more`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ListFineTuningJobCheckpointsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListFineTuningJobCheckpointsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListFineTuningJobCheckpointsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[FineTuningJobCheckpoint]", loadNamespace("openapi"))
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("list"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`first_id` <- this_object$`first_id`
      self$`last_id` <- this_object$`last_id`
      self$`has_more` <- this_object$`has_more`
      self
    },
    #' Validate JSON input with respect to ListFineTuningJobCheckpointsResponse
    #'
    #' @description
    #' Validate JSON input with respect to ListFineTuningJobCheckpointsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListFineTuningJobCheckpointsResponse: the required field `data` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListFineTuningJobCheckpointsResponse: the required field `object` is missing."))
      }
      # check the required field `has_more`
      if (!is.null(input_json$`has_more`)) {
        if (!(is.logical(input_json$`has_more`) && length(input_json$`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", input_json$`has_more`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListFineTuningJobCheckpointsResponse: the required field `has_more` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ListFineTuningJobCheckpointsResponse
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
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
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
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
        invalid_fields["has_more"] <- "Non-nullable required field `has_more` cannot be null."
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
# ListFineTuningJobCheckpointsResponse$unlock()
#
## Below is an example to define the print function
# ListFineTuningJobCheckpointsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ListFineTuningJobCheckpointsResponse$lock()

