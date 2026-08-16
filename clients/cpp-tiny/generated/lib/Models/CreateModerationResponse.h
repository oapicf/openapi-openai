
/*
 * CreateModerationResponse.h
 *
 * Represents if a given text input is potentially harmful.
 */

#ifndef TINY_CPP_CLIENT_CreateModerationResponse_H_
#define TINY_CPP_CLIENT_CreateModerationResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateModerationResponse_results_inner.h"
#include <list>

namespace Tiny {


/*! \brief Represents if a given text input is potentially harmful.
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse{
public:

    /*! \brief Constructor.
	 */
    CreateModerationResponse();
    CreateModerationResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The unique identifier for the moderation request.
	 */
	std::string getId();

	/*! \brief Set The unique identifier for the moderation request.
	 */
	void setId(std::string  id);
	/*! \brief Get The model used to generate the moderation results.
	 */
	std::string getModel();

	/*! \brief Set The model used to generate the moderation results.
	 */
	void setModel(std::string  model);
	/*! \brief Get A list of moderation objects.
	 */
	std::list<CreateModerationResponse_results_inner> getResults();

	/*! \brief Set A list of moderation objects.
	 */
	void setResults(std::list <CreateModerationResponse_results_inner> results);


    private:
    std::string id{};
    std::string model{};
    std::list<CreateModerationResponse_results_inner> results;
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationResponse_H_ */
