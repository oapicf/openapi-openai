#' @docType class
#' @title RunStepStreamEvent
#'
#' @description RunStepStreamEvent Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepStreamEvent <- R6::R6Class(
  "RunStepStreamEvent",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("RunStepStreamEventOneOf", "RunStepStreamEventOneOf1", "RunStepStreamEventOneOf2", "RunStepStreamEventOneOf3", "RunStepStreamEventOneOf4", "RunStepStreamEventOneOf5", "RunStepStreamEventOneOf6"),

    #' @description
    #' Initialize a new RunStepStreamEvent.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "RunStepStreamEventOneOf", "RunStepStreamEventOneOf1", "RunStepStreamEventOneOf2", "RunStepStreamEventOneOf3", "RunStepStreamEventOneOf4", "RunStepStreamEventOneOf5", "RunStepStreamEventOneOf6"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEventOneOf") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEventOneOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEventOneOf1") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEventOneOf1"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEventOneOf2") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEventOneOf2"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEventOneOf3") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEventOneOf3"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEventOneOf4") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEventOneOf4"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEventOneOf5") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEventOneOf5"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEventOneOf6") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEventOneOf6"
      } else {
        stop(paste("Failed to initialize RunStepStreamEvent with oneOf schemas RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepStreamEvent.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStepStreamEvent.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepStreamEvent.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStepStreamEvent.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `RunStepStreamEventOneOf_result` <- tryCatch({
          `RunStepStreamEventOneOf`$public_methods$validateJSON(input)
          `RunStepStreamEventOneOf_instance` <- `RunStepStreamEventOneOf`$new()
          instance <- `RunStepStreamEventOneOf_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEventOneOf"
          matched_schemas <- append(matched_schemas, "RunStepStreamEventOneOf")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEventOneOf_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEventOneOf_result`["message"])
      }

      `RunStepStreamEventOneOf1_result` <- tryCatch({
          `RunStepStreamEventOneOf1`$public_methods$validateJSON(input)
          `RunStepStreamEventOneOf1_instance` <- `RunStepStreamEventOneOf1`$new()
          instance <- `RunStepStreamEventOneOf1_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEventOneOf1"
          matched_schemas <- append(matched_schemas, "RunStepStreamEventOneOf1")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEventOneOf1_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEventOneOf1_result`["message"])
      }

      `RunStepStreamEventOneOf2_result` <- tryCatch({
          `RunStepStreamEventOneOf2`$public_methods$validateJSON(input)
          `RunStepStreamEventOneOf2_instance` <- `RunStepStreamEventOneOf2`$new()
          instance <- `RunStepStreamEventOneOf2_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEventOneOf2"
          matched_schemas <- append(matched_schemas, "RunStepStreamEventOneOf2")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEventOneOf2_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEventOneOf2_result`["message"])
      }

      `RunStepStreamEventOneOf3_result` <- tryCatch({
          `RunStepStreamEventOneOf3`$public_methods$validateJSON(input)
          `RunStepStreamEventOneOf3_instance` <- `RunStepStreamEventOneOf3`$new()
          instance <- `RunStepStreamEventOneOf3_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEventOneOf3"
          matched_schemas <- append(matched_schemas, "RunStepStreamEventOneOf3")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEventOneOf3_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEventOneOf3_result`["message"])
      }

      `RunStepStreamEventOneOf4_result` <- tryCatch({
          `RunStepStreamEventOneOf4`$public_methods$validateJSON(input)
          `RunStepStreamEventOneOf4_instance` <- `RunStepStreamEventOneOf4`$new()
          instance <- `RunStepStreamEventOneOf4_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEventOneOf4"
          matched_schemas <- append(matched_schemas, "RunStepStreamEventOneOf4")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEventOneOf4_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEventOneOf4_result`["message"])
      }

      `RunStepStreamEventOneOf5_result` <- tryCatch({
          `RunStepStreamEventOneOf5`$public_methods$validateJSON(input)
          `RunStepStreamEventOneOf5_instance` <- `RunStepStreamEventOneOf5`$new()
          instance <- `RunStepStreamEventOneOf5_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEventOneOf5"
          matched_schemas <- append(matched_schemas, "RunStepStreamEventOneOf5")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEventOneOf5_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEventOneOf5_result`["message"])
      }

      `RunStepStreamEventOneOf6_result` <- tryCatch({
          `RunStepStreamEventOneOf6`$public_methods$validateJSON(input)
          `RunStepStreamEventOneOf6_instance` <- `RunStepStreamEventOneOf6`$new()
          instance <- `RunStepStreamEventOneOf6_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEventOneOf6"
          matched_schemas <- append(matched_schemas, "RunStepStreamEventOneOf6")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEventOneOf6_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEventOneOf6_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into RunStepStreamEvent with oneOf schemas RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into RunStepStreamEvent with oneOf schemas RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize RunStepStreamEvent to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the RunStepStreamEvent.
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      if (!is.null(self$actual_instance)) {
        json <- jsonlite::toJSON(simple, auto_unbox = TRUE, ...)
        return(as.character(jsonlite::minify(json)))
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert RunStepStreamEvent to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      if (!is.null(self$actual_instance)) {
        return(self$actual_instance$toSimpleType())
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Validate the input JSON with respect to RunStepStreamEvent and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#RunStepStreamEvent$unlock()
#
## Below is an example to define the print function
#RunStepStreamEvent$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#RunStepStreamEvent$lock()

