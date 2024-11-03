#' Create a new ListPaginatedFineTuningJobsResponse
#'
#' @description
#' ListPaginatedFineTuningJobsResponse Class
#'
#' @docType class
#' @title ListPaginatedFineTuningJobsResponse
#' @description ListPaginatedFineTuningJobsResponse Class
#' @format An \code{R6Class} generator object
#' @field data  list(\link{FineTuningJob})
#' @field has_more  character
#' @field object  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ListPaginatedFineTuningJobsResponse <- R6::R6Class(
  "ListPaginatedFineTuningJobsResponse",
  public = list(
    `data` = NULL,
    `has_more` = NULL,
    `object` = NULL,

    #' @description
    #' Initialize a new ListPaginatedFineTuningJobsResponse class.
    #'
    #' @param data data
    #' @param has_more has_more
    #' @param object object
    #' @param ... Other optional arguments.
    initialize = function(`data`, `has_more`, `object`, ...) {
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
      if (!missing(`has_more`)) {
        if (!(is.logical(`has_more`) && length(`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", `has_more`))
        }
        self$`has_more` <- `has_more`
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
    },

    #' @description
    #' To JSON String
    #'
    #' @return ListPaginatedFineTuningJobsResponse in JSON format
    toJSON = function() {
      ListPaginatedFineTuningJobsResponseObject <- list()
      if (!is.null(self$`data`)) {
        ListPaginatedFineTuningJobsResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toJSON())
      }
      if (!is.null(self$`has_more`)) {
        ListPaginatedFineTuningJobsResponseObject[["has_more"]] <-
          self$`has_more`
      }
      if (!is.null(self$`object`)) {
        ListPaginatedFineTuningJobsResponseObject[["object"]] <-
          self$`object`
      }
      ListPaginatedFineTuningJobsResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ListPaginatedFineTuningJobsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListPaginatedFineTuningJobsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[FineTuningJob]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`has_more`)) {
        self$`has_more` <- this_object$`has_more`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("list"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ListPaginatedFineTuningJobsResponse in JSON format
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
        if (!is.null(self$`has_more`)) {
          sprintf(
          '"has_more":
            %s
                    ',
          tolower(self$`has_more`)
          )
        },
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ListPaginatedFineTuningJobsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListPaginatedFineTuningJobsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[FineTuningJob]", loadNamespace("openapi"))
      self$`has_more` <- this_object$`has_more`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("list"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self
    },

    #' @description
    #' Validate JSON input with respect to ListPaginatedFineTuningJobsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListPaginatedFineTuningJobsResponse: the required field `data` is missing."))
      }
      # check the required field `has_more`
      if (!is.null(input_json$`has_more`)) {
        if (!(is.logical(input_json$`has_more`) && length(input_json$`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", input_json$`has_more`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListPaginatedFineTuningJobsResponse: the required field `has_more` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListPaginatedFineTuningJobsResponse: the required field `object` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ListPaginatedFineTuningJobsResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
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
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
        invalid_fields["has_more"] <- "Non-nullable required field `has_more` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
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
# ListPaginatedFineTuningJobsResponse$unlock()
#
## Below is an example to define the print function
# ListPaginatedFineTuningJobsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ListPaginatedFineTuningJobsResponse$lock()

