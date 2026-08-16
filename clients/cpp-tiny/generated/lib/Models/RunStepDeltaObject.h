
/*
 * RunStepDeltaObject.h
 *
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaObject_delta.h"

namespace Tiny {


/*! \brief Represents a run step delta i.e. any changed fields on a run step during streaming. 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaObject();
    RunStepDeltaObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string id{};
    std::string object{};
    RunStepDeltaObject_delta delta;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaObject_H_ */
