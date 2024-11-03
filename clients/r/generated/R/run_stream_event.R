#' @docType class
#' @title RunStreamEvent
#'
#' @description RunStreamEvent Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStreamEvent <- R6::R6Class(
  "RunStreamEvent",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("RunStreamEventOneOf", "RunStreamEventOneOf1", "RunStreamEventOneOf2", "RunStreamEventOneOf3", "RunStreamEventOneOf4", "RunStreamEventOneOf5", "RunStreamEventOneOf6", "RunStreamEventOneOf7", "RunStreamEventOneOf8"),

    #' @description
    #' Initialize a new RunStreamEvent.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "RunStreamEventOneOf", "RunStreamEventOneOf1", "RunStreamEventOneOf2", "RunStreamEventOneOf3", "RunStreamEventOneOf4", "RunStreamEventOneOf5", "RunStreamEventOneOf6", "RunStreamEventOneOf7", "RunStreamEventOneOf8"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf1") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf1"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf2") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf2"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf3") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf3"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf4") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf4"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf5") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf5"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf6") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf6"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf7") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf7"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEventOneOf8") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEventOneOf8"
      } else {
        stop(paste("Failed to initialize RunStreamEvent with oneOf schemas RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStreamEvent.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStreamEvent.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStreamEvent.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStreamEvent.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `RunStreamEventOneOf_result` <- tryCatch({
          `RunStreamEventOneOf`$public_methods$validateJSON(input)
          `RunStreamEventOneOf_instance` <- `RunStreamEventOneOf`$new()
          instance <- `RunStreamEventOneOf_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf_result`["message"])
      }

      `RunStreamEventOneOf1_result` <- tryCatch({
          `RunStreamEventOneOf1`$public_methods$validateJSON(input)
          `RunStreamEventOneOf1_instance` <- `RunStreamEventOneOf1`$new()
          instance <- `RunStreamEventOneOf1_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf1"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf1")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf1_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf1_result`["message"])
      }

      `RunStreamEventOneOf2_result` <- tryCatch({
          `RunStreamEventOneOf2`$public_methods$validateJSON(input)
          `RunStreamEventOneOf2_instance` <- `RunStreamEventOneOf2`$new()
          instance <- `RunStreamEventOneOf2_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf2"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf2")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf2_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf2_result`["message"])
      }

      `RunStreamEventOneOf3_result` <- tryCatch({
          `RunStreamEventOneOf3`$public_methods$validateJSON(input)
          `RunStreamEventOneOf3_instance` <- `RunStreamEventOneOf3`$new()
          instance <- `RunStreamEventOneOf3_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf3"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf3")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf3_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf3_result`["message"])
      }

      `RunStreamEventOneOf4_result` <- tryCatch({
          `RunStreamEventOneOf4`$public_methods$validateJSON(input)
          `RunStreamEventOneOf4_instance` <- `RunStreamEventOneOf4`$new()
          instance <- `RunStreamEventOneOf4_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf4"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf4")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf4_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf4_result`["message"])
      }

      `RunStreamEventOneOf5_result` <- tryCatch({
          `RunStreamEventOneOf5`$public_methods$validateJSON(input)
          `RunStreamEventOneOf5_instance` <- `RunStreamEventOneOf5`$new()
          instance <- `RunStreamEventOneOf5_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf5"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf5")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf5_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf5_result`["message"])
      }

      `RunStreamEventOneOf6_result` <- tryCatch({
          `RunStreamEventOneOf6`$public_methods$validateJSON(input)
          `RunStreamEventOneOf6_instance` <- `RunStreamEventOneOf6`$new()
          instance <- `RunStreamEventOneOf6_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf6"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf6")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf6_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf6_result`["message"])
      }

      `RunStreamEventOneOf7_result` <- tryCatch({
          `RunStreamEventOneOf7`$public_methods$validateJSON(input)
          `RunStreamEventOneOf7_instance` <- `RunStreamEventOneOf7`$new()
          instance <- `RunStreamEventOneOf7_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf7"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf7")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf7_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf7_result`["message"])
      }

      `RunStreamEventOneOf8_result` <- tryCatch({
          `RunStreamEventOneOf8`$public_methods$validateJSON(input)
          `RunStreamEventOneOf8_instance` <- `RunStreamEventOneOf8`$new()
          instance <- `RunStreamEventOneOf8_instance`$fromJSON(input)
          instance_type <- "RunStreamEventOneOf8"
          matched_schemas <- append(matched_schemas, "RunStreamEventOneOf8")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEventOneOf8_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEventOneOf8_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into RunStreamEvent with oneOf schemas RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into RunStreamEvent with oneOf schemas RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize RunStreamEvent to JSON string.
    #'
    #' @return JSON string representation of the RunStreamEvent.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize RunStreamEvent to JSON.
    #'
    #' @return JSON representation of the RunStreamEvent.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to RunStreamEvent and
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
#RunStreamEvent$unlock()
#
## Below is an example to define the print function
#RunStreamEvent$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#RunStreamEvent$lock()

