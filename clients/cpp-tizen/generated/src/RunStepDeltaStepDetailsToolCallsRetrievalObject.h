/*
 * RunStepDeltaStepDetailsToolCallsRetrievalObject.h
 *
 * 
 */

#ifndef _RunStepDeltaStepDetailsToolCallsRetrievalObject_H_
#define _RunStepDeltaStepDetailsToolCallsRetrievalObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsRetrievalObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaStepDetailsToolCallsRetrievalObject();
	RunStepDeltaStepDetailsToolCallsRetrievalObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaStepDetailsToolCallsRetrievalObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of the tool call in the tool calls array.
	 */
	int getIndex();

	/*! \brief Set The index of the tool call in the tool calls array.
	 */
	void setIndex(int  index);
	/*! \brief Get The ID of the tool call object.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call object.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call. This is always going to be `retrieval` for this type of tool call.
	 */
	std::string getType();

	/*! \brief Set The type of tool call. This is always going to be `retrieval` for this type of tool call.
	 */
	void setType(std::string  type);
	/*! \brief Get For now, this is always going to be an empty object.
	 */
	std::string getRetrieval();

	/*! \brief Set For now, this is always going to be an empty object.
	 */
	void setRetrieval(std::string  retrieval);

private:
	int index;
	std::string id;
	std::string type;
	std::string retrieval;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaStepDetailsToolCallsRetrievalObject_H_ */
