/*
 * RunStepDeltaObject.h
 *
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */

#ifndef _RunStepDeltaObject_H_
#define _RunStepDeltaObject_H_


#include <string>
#include "RunStepDeltaObject_delta.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a run step delta i.e. any changed fields on a run step during streaming. 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaObject();
	RunStepDeltaObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier of the run step, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier of the run step, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `thread.run.step.delta`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread.run.step.delta`.
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	RunStepDeltaObject_delta getDelta();

	/*! \brief Set 
	 */
	void setDelta(RunStepDeltaObject_delta  delta);

private:
	std::string id;
	std::string object;
	RunStepDeltaObject_delta delta;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaObject_H_ */
