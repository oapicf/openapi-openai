
/*
 * RunStepDetailsToolCallsFileSearchObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsFileSearchObject_file_search.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsFileSearchObject();
    RunStepDetailsToolCallsFileSearchObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsFileSearchObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the tool call object.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call object.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call. This is always going to be `file_search` for this type of tool call.
	 */
	std::string getType();

	/*! \brief Set The type of tool call. This is always going to be `file_search` for this type of tool call.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFileSearchObject_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(RunStepDetailsToolCallsFileSearchObject_file_search  file_search);


    private:
    std::string id{};
    std::string type{};
    RunStepDetailsToolCallsFileSearchObject_file_search file_search;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchObject_H_ */
