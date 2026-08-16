
/*
 * RunObject_incomplete_details.h
 *
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 */

#ifndef TINY_CPP_CLIENT_RunObject_incomplete_details_H_
#define TINY_CPP_CLIENT_RunObject_incomplete_details_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Details on why the run is incomplete. Will be `null` if the run is not incomplete.
 *
 *  \ingroup Models
 *
 */

class RunObject_incomplete_details{
public:

    /*! \brief Constructor.
	 */
    RunObject_incomplete_details();
    RunObject_incomplete_details(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunObject_incomplete_details();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
	 */
	std::string getReason();

	/*! \brief Set The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
	 */
	void setReason(std::string  reason);


    private:
    std::string reason{};
};
}

#endif /* TINY_CPP_CLIENT_RunObject_incomplete_details_H_ */
