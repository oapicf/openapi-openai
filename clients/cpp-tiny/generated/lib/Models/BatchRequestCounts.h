
/*
 * Batch_request_counts.h
 *
 * The request counts for different statuses within the batch.
 */

#ifndef TINY_CPP_CLIENT_Batch_request_counts_H_
#define TINY_CPP_CLIENT_Batch_request_counts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The request counts for different statuses within the batch.
 *
 *  \ingroup Models
 *
 */

class Batch_request_counts{
public:

    /*! \brief Constructor.
	 */
    Batch_request_counts();
    Batch_request_counts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Batch_request_counts();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Total number of requests in the batch.
	 */
	int getTotal();

	/*! \brief Set Total number of requests in the batch.
	 */
	void setTotal(int  total);
	/*! \brief Get Number of requests that have been completed successfully.
	 */
	int getCompleted();

	/*! \brief Set Number of requests that have been completed successfully.
	 */
	void setCompleted(int  completed);
	/*! \brief Get Number of requests that have failed.
	 */
	int getFailed();

	/*! \brief Set Number of requests that have failed.
	 */
	void setFailed(int  failed);


    private:
    int total{};
    int completed{};
    int failed{};
};
}

#endif /* TINY_CPP_CLIENT_Batch_request_counts_H_ */
